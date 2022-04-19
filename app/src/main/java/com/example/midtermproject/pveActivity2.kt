package com.example.midtermproject

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class pveActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pve2)
        findViewById<TextView>(R.id.textView).text = getIntent().getStringExtra("p1").toString() + "'s turn"

    }
    var s = "X"

    fun onClick(v: View) {

        var btn1:Button = findViewById<Button>(R.id.pvebutton)
        var btn2:Button = findViewById<Button>(R.id.pvebutton2)
        var btn3:Button = findViewById<Button>(R.id.pvebutton3)
        var btn4:Button = findViewById<Button>(R.id.pvebutton4)
        var btn5:Button = findViewById<Button>(R.id.pvebutton5)
        var btn6:Button = findViewById<Button>(R.id.pvebutton6)
        var btn7:Button = findViewById<Button>(R.id.pvebutton7)
        var btn8:Button = findViewById<Button>(R.id.pvebutton8)
        var btn9:Button = findViewById<Button>(R.id.pvebutton9)

        val buttons = arrayOf(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9)


        if (v.id == btn1.id) {
            btn1.setText(s)
            btn1.isClickable = false
        } else if (v.id == btn2.id) {
            btn2.setText(s)
            btn2.isClickable = false
        }else if (v.id == btn3.id) {
            btn3.setText(s)
            btn3.isClickable = false
        }else if (v.id == btn4.id) {
            btn4.setText(s)
            btn4.isClickable = false
        }else if (v.id == btn5.id) {
            btn5.setText(s)
            btn5.isClickable = false
        }else if (v.id == btn6.id) {
            btn6.setText(s)
            btn6.isClickable = false
        }else if (v.id == btn7.id) {
            btn7.setText(s)
            btn7.isClickable = false
        }else if (v.id == btn8.id) {
            btn8.setText(s)
            btn8.isClickable = false
        }else if (v.id == btn9.id) {
            btn9.setText(s)
            btn9.isClickable = false
        }

        checkWin(s)

        if (s=="X"){
            s = "O"
            findViewById<TextView>(R.id.textView).text = "AI's turn!"

            while(true){
                var a = Random.nextInt(0,8)
                if(buttons[a].text!="" && buttons[a].isClickable){
                    buttons[a].text = "O"
                    Log.d("robot","robot move")
                    break
                }

            }
            Log.d("robot","robot done")
        }
        else if (s=="O"){
            s = "X"
            findViewById<TextView>(R.id.textView).text = getIntent().getStringExtra("p1").toString() + "'s turn"
        }
    }

    fun checkWin(s: String){

        if(findViewById<Button>(R.id.pvebutton).text == s && findViewById<Button>(R.id.pvebutton2).text == s && findViewById<Button>(R.id.pvebutton3).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton).text == s && findViewById<Button>(R.id.pvebutton4).text == s && findViewById<Button>(R.id.pvebutton7).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton).text == s && findViewById<Button>(R.id.pvebutton5).text == s && findViewById<Button>(R.id.pvebutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton2).text == s && findViewById<Button>(R.id.pvebutton5).text == s && findViewById<Button>(R.id.pvebutton8).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton3).text == s && findViewById<Button>(R.id.pvebutton6).text == s && findViewById<Button>(R.id.pvebutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton4).text == s && findViewById<Button>(R.id.pvebutton5).text == s && findViewById<Button>(R.id.pvebutton6).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton7).text == s && findViewById<Button>(R.id.pvebutton8).text == s && findViewById<Button>(R.id.pvebutton9).text == s){
            showWinter(s)
        }else if(findViewById<Button>(R.id.pvebutton7).text == s && findViewById<Button>(R.id.pvebutton5).text == s && findViewById<Button>(R.id.pvebutton3).text == s){
            showWinter(s)
        }

    }
    fun showWinter(s: String) {

        var joe = "X"
        if (s == "X") {
            joe = getIntent().getStringExtra("p1").toString()
        } else
            joe = getIntent().getStringExtra("p2").toString()

        AlertDialog.Builder(this)
            .setTitle(joe + " won!")
            .setCancelable(false)
            .show()



    }
}
