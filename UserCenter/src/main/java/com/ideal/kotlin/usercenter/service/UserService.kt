package com.ideal.kotlin.usercenter.service

import io.reactivex.Observable


/**
 * 日期: 2018/6/20 23:20
 * author: guoning
 * description:
 */
interface UserService {
    /**
     * 注册
     */
    fun register(name : String,password : String,vertifyCode : String) : Observable<Boolean>
}