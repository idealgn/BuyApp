package com.ideal.kotlin.usercenter.service.impl

import com.ideal.kotlin.usercenter.service.UserService
import io.reactivex.Observable


/**
 * 日期: 2018/6/20 23:24
 * author: guoning
 * description:
 */
class UserServiceImpl : UserService {

    override fun register(name: String, password: String, vertifyCode: String): Observable<Boolean> {
            return Observable.just(true)
    }
}