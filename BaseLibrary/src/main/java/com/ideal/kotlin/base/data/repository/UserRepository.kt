package com.ideal.kotlin.base.data.repository

import com.ideal.kotlin.base.api.UserApi
import com.ideal.kotlin.base.data.net.RetrofitFactory
import com.ideal.kotlin.base.data.protocol.request.RequestRegister
import com.ideal.kotlin.base.data.protocol.response.BaseResponseBean
import io.reactivex.Observable

/**
 * 日期: 2018/6/24 23:55
 * author: guoning
 * description:
 */
class UserRepository {
    fun register(name: String, password: String, verifyCode: String): Observable<BaseResponseBean<String>>{
        return RetrofitFactory.factory.create(UserApi::class.java)
                .register(RequestRegister(name,password,verifyCode))

    }
}