package com.example.joe.cvappchallenge.remote

import com.example.joe.cvappchallenge.models.ApiRespone
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RemoteHelper {
    fun getCV(name:String):Single<ApiRespone>{
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder().client(okHttpClient)
            .baseUrl("https://gist.githubusercontent.com/JoeYada/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RemoteService::class.java)

        return service.getCV(name)
    }

}