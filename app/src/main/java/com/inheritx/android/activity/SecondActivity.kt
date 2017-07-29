package com.inheritx.android.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.inheritx.android.R

/**
 * Created by root on 27/6/17.
 */
class SecondActivity : AppCompatActivity(){
    lateinit var btnToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        btnToast = findViewById(R.id.btnShowToast) as Button
        btnToast.setOnClickListener { Toast.makeText(this, "-" + intent.getStringExtra("abc"), Toast.LENGTH_LONG).show() }
    }
}