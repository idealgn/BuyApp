package com.ideal.kotlin.usercenter.service.impl

import com.ideal.kotlin.base.data.protocol.response.BaseResponseBean
import com.ideal.kotlin.base.data.repository.UserRepository
import com.ideal.kotlin.base.rx.BaseException
import com.ideal.kotlin.usercenter.service.UserService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function


/**
 * 日期: 2018/6/20 23:24
 * author: guoning
 * description:
 */
class UserServiceImpl : UserService {

    override fun register(name: String, password: String, verifyCode: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(name,password,verifyCode).flatMap(object : Function<BaseResponseBean<String>,ObservableSource<Boolean>>{
            override fun apply(t: BaseResponseBean<String>): ObservableSource<Boolean> {
                val code = t.code
                val msg = t.msg
                val data = t.data
                if (code==200)
                    return Observable.just(true)
                else
                    return Observable.error(BaseException(code,msg))
            }

        })
    }
}