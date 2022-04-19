package com.example.midtermproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class pvpActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pvp2)
        findViewById<TextView>(R.id.textView).text = getIntent().getStringExtra("p1").toString() + "'s turn"

    }
    var s = "X"

    fun onClick(v: View) {

        if (v.id == R.id.pvpbutton) {
            findViewById<Button>(R.id.pvpbutton).setText(s)
            findViewById<Button>(R.id.pvpbutton).isClickable = false
        } else if (v.id == R.id.pvpbutton2) {
            findViewById<Button>(R.id.pvpbutton2).setText(s)
            findViewById<Button>(R.id.pvpbutton2).isClickable = false
        }else if (v.id == R.id.pvpbutton3) {
            findViewById<Button>(R.id.pvpbutton3).setText(s)
            findViewById<Button>(R.id.pvpbutton3).isClickable = false
        }else if (v.id == R.id.pvpbutton4) {
            findViewById<Button>(R.id.pvpbutton4).setText(s)
            findViewById<Button>(R.id.pvpbutton4).isClickable = false
        }else if (v.id == R.id.pvpbutton5) {
            findViewById<Button>(R.id.pvpbutton5).setText(s)
            findViewById<Button>(R.id.pvpbutton5).isClickable = false
        }else if (v.id == R.id.pvpbutton6) {
            findViewById<Button>(R.id.pvpbutton6).setText(s)
            findViewById<Button>(R.id.pvpbutton6).isClickable = false
        }else if (v.id == R.id.pvpbutton7) {
            findViewById<Button>(R.id.pvpbutton7).setText(s)
            findViewById<Button>(R.id.pvpbutton7).isClickable = false
        }else if (v.id == R.id.pvpbutton8) {
            findViewById<Button>(R.id.pvpbutton8).setText(s)
            findViewById<Button>(R.id.pvpbutton8).isClickable = false
        }else if (v.id == R.id.pvpbutton9) {
            findViewById<Button>(R.id.pvpbutton9).setText(s)
            findViewById<Button>(R.id.pvpbutton9).isClickable = false
        }

        checkWin(s)

        if (s=="X"){
            s = "O"
            findViewById<TextView>(R.id.textView).text = getIntent().getStringExtra("p2").toString() + "'s turn!"
        }
        else if (s=="O"){
            s = "X"
            findViewById<TextView>(R.id.textView).text = getIntent().getStringExtra("p1").toString() + "'s turn!"
        }
    }

    fun checkWin(s: String){

        if(findViewById<Button>(R.id.pvpbutton).text == s && findViewById<Button>(R.id.pvpbutton2).text == s && findViewById<Button>(R.id.pvpbutton3).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton).text == s && findViewById<Button>(R.id.pvpbutton4).text == s && findViewById<Button>(R.id.pvpbutton7).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton).text == s && findViewById<Button>(R.id.pvpbutton5).text == s && findViewById<Button>(R.id.pvpbutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton2).text == s && findViewById<Button>(R.id.pvpbutton5).text == s && findViewById<Button>(R.id.pvpbutton8).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton3).text == s && findViewById<Button>(R.id.pvpbutton6).text == s && findViewById<Button>(R.id.pvpbutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton4).text == s && findViewById<Button>(R.id.pvpbutton5).text == s && findViewById<Button>(R.id.pvpbutton6).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton7).text == s && findViewById<Button>(R.id.pvpbutton8).text == s && findViewById<Button>(R.id.pvpbutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton7).text == s && findViewById<Button>(R.id.pvpbutton5).text == s && findViewById<Button>(R.id.pvpbutton3).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvpbutton8).text != "" &&
                findViewById<Button>(R.id.pvpbutton9).text != "" &&
                findViewById<Button>(R.id.pvpbutton7).text != "" &&
                findViewById<Button>(R.id.pvpbutton6).text != "" &&
                findViewById<Button>(R.id.pvpbutton5).text != "" &&
                findViewById<Button>(R.id.pvpbutton4).text != "" &&
                findViewById<Button>(R.id.pvpbutton3).text != "" &&
                findViewById<Button>(R.id.pvpbutton2).text != "" &&
                findViewById<Button>(R.id.pvpbutton).text != ""){
                AlertDialog.Builder(this)
                    .setTitle("DRAW!")
                    .show()
                buttonFalse()
        }
    }
    fun showWinter(s: String) {

        var b = "X"
        if (s == "X") {
            b = getIntent().getStringExtra("p1").toString()
        }else
            b = getIntent().getStringExtra("p2").toString()
        AlertDialog.Builder(this)
            .setTitle(b + " won!")
            .show()
            buttonFalse()
    }


    fun pvpActivity(view: View?) {
        startActivity(Intent(this@pvpActivity2, pvpActivity::class.java))
    }

    fun buttonFalse(){
        findViewById<Button>(R.id.pvpbutton).isClickable = false
        findViewById<Button>(R.id.pvpbutton2).isClickable = false
        findViewById<Button>(R.id.pvpbutton3).isClickable = false
        findViewById<Button>(R.id.pvpbutton4).isClickable = false
        findViewById<Button>(R.id.pvpbutton5).isClickable = false
        findViewById<Button>(R.id.pvpbutton6).isClickable = false
        findViewById<Button>(R.id.pvpbutton7).isClickable = false
        findViewById<Button>(R.id.pvpbutton8).isClickable = false
        findViewById<Button>(R.id.pvpbutton9).isClickable = false
    }
}


