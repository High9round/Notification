package com.hi9h_9r0und.notification

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart.setOnClickListener{
            Toast.makeText(applicationContext,"service start",Toast.LENGTH_SHORT).show()
            var intent= Intent(this@MainActivity, MyService::class.java)
            startService(intent)
        }

        buttonEnd.setOnClickListener {
            Toast.makeText(applicationContext,"service end",Toast.LENGTH_SHORT).show()
            var intent= Intent(this@MainActivity, MyService::class.java)
            stopService(intent)
        }
    }
}
