package com.ideal.kotlin.usercenter.ui.activity

import android.view.View
import com.ideal.kotlin.base.ui.BaseMvpActivity
import com.ideal.kotlin.usercenter.R
import com.ideal.kotlin.usercenter.mvp.presenter.RegistePresenter
import com.ideal.kotlin.usercenter.mvp.view.IRegisteView
import kotlinx.android.synthetic.main.activity_registe.*
import org.jetbrains.anko.toast

/**
 * 日期: 2018/6/18 23:30
 * author: guoning
 * description: 登录
 */
class RegisteActivity : BaseMvpActivity<IRegisteView,RegistePresenter>() ,IRegisteView{


    override fun registerResult(flag: Boolean) {
        println("success----------------------")
        toast("success").show()
    }

    override fun showLoading() {
        toast(this::class.java.simpleName)
    }

    override fun createView(): IRegisteView {
        return this
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun createPresenter(): RegistePresenter {
        return RegistePresenter()
    }

    override fun getLayout(): Int {
        return R.layout.activity_registe
    }


    fun register(view : View){
        var phone = phone.text.toString()
        var password = password.text.toString()
        var vertifyCode  = verifyCode.text.toString()
        presenter.register(phone,password,vertifyCode)
    }

}