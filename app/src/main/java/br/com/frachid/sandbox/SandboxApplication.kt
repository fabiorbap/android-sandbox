package br.com.frachid.sandbox

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class SandboxApplication : Application() {

    override fun onCreate() {
        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
                .name("task.realm")
                .deleteRealmIfMigrationNeeded()
                .schemaVersion(0)
                .build()
        Realm.setDefaultConfiguration(realmConfig)
        super.onCreate()
    }

}