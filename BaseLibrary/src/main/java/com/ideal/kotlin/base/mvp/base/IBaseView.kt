package com.ideal.kotlin.base.mvp.base

/**
 * 日期: 2018/6/20 0:45
 * author: guoning
 * description:
 */
interface IBaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}