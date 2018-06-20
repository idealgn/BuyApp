package com.ideal.kotlin.usercenter.mvp.presenter

import com.ideal.kotlin.base.mvp.base.BasePresenter
import com.ideal.kotlin.usercenter.mvp.view.IRegisteView
import com.ideal.kotlin.usercenter.service.impl.UserServiceImpl
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.reactivestreams.Subscriber

/**
 * 日期: 2018/6/20 22:36
 * author: guoning
 * description:
 */
class RegistePresenter :BasePresenter<IRegisteView>() {



    fun register(name: String?, password: String?, vertifyCode: String?) {
        val userServiceImpl = UserServiceImpl()
        val disposable = userServiceImpl?.register(name!!, password!!, vertifyCode!!)
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view.registerResult(it)
                }, {

                }, {

                })

    }

}