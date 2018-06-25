package com.ideal.kotlin.usercenter.service.impl

import com.ideal.kotlin.base.api.UserApi
import com.ideal.kotlin.base.data.net.RetrofitFactory
import com.ideal.kotlin.base.data.protocol.request.RegisterRequest
import com.ideal.kotlin.base.data.protocol.response.BaseResponseBean
import com.ideal.kotlin.base.data.repository.UserRepository
import com.ideal.kotlin.usercenter.service.UserService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import java.util.function.Function


/**
 * 日期: 2018/6/20 23:24
 * author: guoning
 * description:
 */
class UserServiceImpl : UserService {

    override fun register(name: String, password: String, verifyCode: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(name,password,verifyCode).flatMap { t1, t2 ->

        }
    }
}