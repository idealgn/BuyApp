package com.ideal.kotlin.base.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * 日期: 2018/6/20 0:50
 * author: guoning
 * description: activity基类
 */
abstract class BaseActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())



    }


    abstract fun getLayout(): Int


}