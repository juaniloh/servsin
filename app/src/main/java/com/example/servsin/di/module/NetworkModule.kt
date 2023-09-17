package com.example.servsin.di.module

import com.example.servsin.retrofit.ServsinDbApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    private val baseUrl = ""

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Singleton
    @Provides
    fun provideDbApi(retrofit: Retrofit): ServsinDbApi =
        retrofit.create(ServsinDbApi::class.java)
}
