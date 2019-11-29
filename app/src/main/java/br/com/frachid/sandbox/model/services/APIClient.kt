    package br.com.frachid.sandbox.model.services

    import br.com.frachid.sandbox.BuildConfig
    import okhttp3.Interceptor
    import okhttp3.OkHttpClient
    import okhttp3.Response
    import okhttp3.logging.HttpLoggingInterceptor
    import retrofit2.Retrofit
    import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
    import retrofit2.converter.gson.GsonConverterFactory
    import okhttp3.HttpUrl




    class APIClient {

        companion object {
            private var retrofit: Retrofit? = null
            const val API_KEY = "key"

            fun getClient(): Retrofit {

                val logging = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY

                val httpClient = OkHttpClient.Builder()
                httpClient.addInterceptor(logging)
                httpClient.addInterceptor(getQueryInterceptor())

                return Retrofit.Builder()
                        .baseUrl(BuildConfig.BASE_URL)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(httpClient.build())
                        .build()
            }

            private fun getQueryInterceptor(): Interceptor {
                return object: Interceptor {
                    override fun intercept(chain: Interceptor.Chain): Response {
                        val original = chain.request()
                        val originalHttpUrl = original.url

                        val url = originalHttpUrl.newBuilder()
                                .addQueryParameter(API_KEY, BuildConfig.API_KEY)
                                .build()

                        // Request customization: add request headers
                        val requestBuilder = original.newBuilder()
                                .url(url)

                        val request = requestBuilder.build()
                        return chain.proceed(request)
                    }
                }
            }
        }


    }