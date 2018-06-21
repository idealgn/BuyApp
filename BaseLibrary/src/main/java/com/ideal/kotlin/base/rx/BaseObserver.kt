package com.ideal.kotlin.base.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * 日期: 2018/6/21 22:04
 * author: guoning
 * description:
 */
open class BaseObserver<T> : Observer<T> {

    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
    }

}