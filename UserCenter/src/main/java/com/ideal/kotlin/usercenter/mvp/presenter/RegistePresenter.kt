package com.ideal.kotlin.usercenter.mvp.presenter

import com.ideal.kotlin.base.ext.execute
import com.ideal.kotlin.base.mvp.base.BasePresenter
import com.ideal.kotlin.base.rx.BaseObserver
import com.ideal.kotlin.usercenter.mvp.view.IRegisteView
import com.ideal.kotlin.usercenter.service.impl.UserServiceImpl

/**
 * 日期: 2018/6/20 22:36
 * author: guoning
 * description:
 */
class RegistePresenter :BasePresenter<IRegisteView>() {



    fun register(name: String?, password: String?, verifyCode: String?) {
        val userServiceImpl = UserServiceImpl()

        val disposable = userServiceImpl.register(name!!, password!!, verifyCode!!)
                .execute(object : BaseObserver<Boolean>(){
                    override fun onNext(t: Boolean) {
                        super.onNext(t)
                        view.registerResult(t)
                    }
                })
    }

}