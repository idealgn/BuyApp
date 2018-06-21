package com.ideal.kotlin.base.ext

import com.ideal.kotlin.base.rx.BaseObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 日期: 2018/6/21 22:03
 * author: guoning
 * description: 扩展函数
 */
fun <T> Observable<T>.execute(observer: BaseObserver<T>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(observer)
}