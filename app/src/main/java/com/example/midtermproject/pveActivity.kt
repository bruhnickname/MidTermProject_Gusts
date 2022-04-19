package com.example.midtermproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class pveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pve)
    }

    fun activity_pve2(view: View) {
        val intent = Intent(this@pveActivity, pveActivity2::class.java)
        intent.putExtra("p1", findViewById<EditText>(R.id.editTextTextPersonName).text.toString())
        startActivity(intent)
    }
}