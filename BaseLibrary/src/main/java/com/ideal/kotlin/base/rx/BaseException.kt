package com.ideal.kotlin.base.rx

/**
 * 日期: 2018/6/25 22:17
 * author: guoning
 * description:
 */
data class BaseException(var code :Int, override var message :String) : Throwable()