package com.ideal.kotlin.base.data.protocol.response

/**
 * 日期: 2018/6/22 22:55
 * author: guoning
 * description:
 */
data class BaseResponseBean<out T>(val msg : String,val code : Int,val data : T)