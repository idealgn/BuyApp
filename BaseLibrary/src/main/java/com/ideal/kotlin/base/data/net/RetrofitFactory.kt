package com.ideal.kotlin.base.data.net

import com.ideal.kotlin.base.common.BaseConstant
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 日期: 2018/6/22 21:39
 * author: guoning
 * description:
 */
class RetrofitFactory private constructor() {

    companion object {
        val factory : RetrofitFactory by lazy { RetrofitFactory() }
    }

    private var retrofit :Retrofit
    private var interceptor :Interceptor

    init {
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.server_address)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(initOkHttpClient())
                .build();

        interceptor = Interceptor {
            chain ->
                val request =  chain.request()
                        .newBuilder()
                        .addHeader("Content-Type","application/json")
                        .addHeader("charset","utf-8")
                        .build()
            chain.proceed(request)
        }
    }

    private fun initOkHttpClient(): OkHttpClient? {
        return OkHttpClient().newBuilder()
                .addInterceptor(initInterceptor())
                .build()
    }

    private fun initInterceptor(): Interceptor? {
        val interceptor  = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun <T> create(t : Class<T>) : T {

        return retrofit.create(t)
    }
}