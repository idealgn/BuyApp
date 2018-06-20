package com.ideal.kotlin.base.ui

import android.os.Bundle
import com.ideal.kotlin.base.mvp.base.BasePresenter
import com.ideal.kotlin.base.mvp.base.IBaseView

/**
 * 日期: 2018/6/20 21:25
 * author: guoning
 * description: mvp基类
 */
abstract class BaseMvpActivity<V : IBaseView, P : BasePresenter<V>> : BaseActivity() {

    lateinit var presenter: P
    lateinit var v: V


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        v = createView()
        presenter.attach(v)
        presenter.showLoading()

//        presenter?.attach(this)
    }

    abstract fun createView(): V

    abstract fun createPresenter(): P


}