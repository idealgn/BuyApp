package com.ideal.kotlin.base.mvp.base

/**
 * 日期: 2018/6/20 0:45
 * author: guoning
 * description:
 */
open class BasePresenter<V : IBaseView> {

   lateinit var view : V

    fun attach(view : V){
        this.view = view
    }

    fun showLoading() {
        if (view!=null){
            view.showLoading()
        }
    }


//    fun detach(){
//        if (view!=null)
//            view = null
//    }



}