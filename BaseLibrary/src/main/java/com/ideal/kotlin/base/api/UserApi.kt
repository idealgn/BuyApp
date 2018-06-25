package com.ideal.kotlin.base.api

import com.ideal.kotlin.base.data.protocol.request.RequestRegister
import com.ideal.kotlin.base.data.protocol.response.BaseResponseBean
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * 日期: 2018/6/24 22:55
 * author: guoning
 * description:
 */
interface UserApi {

    @POST("userCenter/register")
    fun register(@Body body : RequestRegister) : Observable<BaseResponseBean<String>>
}