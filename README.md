# android-sandbox
Repository to experiment with Android technologies

# Introduction

I created this repository to experiment with architectures, dependencies and personal ideas in Android.

Initially, this will be a simple CRUD app for users, which will allow me to experiment with many topics I'm interested in.
At this moment, it is not integrated with any external databsae, but it will be integrated with Firebase in the future.

It is a repository in permanent change, as I intend to constantly experiment with it.

# Setup

You will need to install Android Studio and also the Android SDK. Follow the instructions [here](https://developer.android.com/studio)
to find out how.

After you have installed them, download the repository and open in Android Studio. Gradle will build it and you may
receive an error message prompting you to install some dependencies such as Build Tools.

Install all that is required until the build is successful.

Then, either run the project in the emulator or in by connecting an Android device to the computer (it may ask you to allow the connection).

If you choose to run it in an emulator, you will have to download one of the available Android versions in Android Studio and select a virtual device.

# Configuration

This project has two [flavors](https://developer.android.com/studio/build/build-variants): App and Storybook.

The Storybook flavor doesn't have a 'release' variant, as it is intended for other objectives such as documentation, as explained below.

If you want to change the flavor, you can simply do it by changing it in Android Studio.

## App

This flavor comprises the actual app, where all the functionalities are available for testing.

At this moment, the available funcionalities are the creation of an user and the retrieval of a list of the users.

The app is using [RealmDB](https://realm.io/) to store content locally, in the device. In the future, when the app is
integrated with Firebase, it will make calls to it and store whatever information is needed locally through Realm.

## Storybook

This flavor comprises the views used in the app, such as text inputs and cells.

It serves as:
- Documentation, so that all the views used are easily found and reused through the app.
- Consistency, as similar views will be grouped together and it will be easy to detect if their style and layout are consitent.
- Sandbox for views, as it is easier to create and test with views in activities without any integration or particular behavior. Instead of having to comment or manipulate the app code so that you can see a view you are building, which may introduce bugs and mess up the code, it is possible to do it in the storybook, where it is not necessary to comment or rewrite code.
