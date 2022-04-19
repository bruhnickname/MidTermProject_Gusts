package com.example.midtermproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pvpActivity(view: View?) {
        startActivity(Intent(this@MainActivity, pvpActivity::class.java))
    }

    fun pveActivity(view: View) {
        startActivity(Intent(this@MainActivity, pveActivity::class.java))
    }

    fun leave(view: View) {
        finish();
        exitProcess(0)
    }
}