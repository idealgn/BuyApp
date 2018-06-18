package com.ideal.kotlin.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.ideal.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_registe.*

/**
 * 日期: 2018/6/18 23:30
 * author: guoning
 * description: 登录
 */
class RegisteActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registe)
        btnRegiste.setOnClickListener {
            Toast.makeText(this@RegisteActivity,"注册",Toast.LENGTH_SHORT).show()
        }
    }

}