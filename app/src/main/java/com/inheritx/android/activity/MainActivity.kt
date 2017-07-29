package com.inheritx.android.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.inheritx.android.R

//Hitesh
class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnSend: Button

    val a: Int? = null

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnSend -> {

                val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("abc", "hitesh")
                startActivity(intent)
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btnSend) as Button
        btnSend.setOnClickListener(this)

    }
}
