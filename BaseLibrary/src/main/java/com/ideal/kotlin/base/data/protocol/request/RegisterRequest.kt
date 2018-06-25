package com.ideal.kotlin.base.data.protocol.request

/**
 * 日期: 2018/6/24 22:57
 * author: guoning
 * description:
 */
data class RegisterRequest(val name :String,val pwd : String,val verifyCode : String)