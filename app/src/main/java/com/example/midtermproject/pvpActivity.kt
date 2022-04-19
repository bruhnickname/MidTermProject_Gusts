package com.example.midtermproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class pvpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pvp)
    }

    fun pvpActivity2(view: View) {
        val intent = Intent(this@pvpActivity, pvpActivity2::class.java)
        intent.putExtra("p1", findViewById<EditText>(R.id.editTextTextPersonName).text.toString())
        intent.putExtra("p2", findViewById<EditText>(R.id.editTextTextPersonName2).text.toString())
        startActivity(intent)
    }



}