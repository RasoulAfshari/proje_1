package com.example.proje_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frm1 : FrameLayout=findViewById(R.id.ac_main_frm1)
        val frm2 : FrameLayout=findViewById(R.id.ac_main_frm2)
        val edit1 : EditText=findViewById(R.id.ac_main_edit_text)
        val btn1 : Button = findViewById(R.id.ac_main_btn)
        val btn2 : Button = findViewById(R.id.ac_main_btn2)

        btn1.setOnClickListener {
            if(edit1.length()!=0) {
                frm1.visibility = View.GONE
                frm2.visibility = View.VISIBLE
            }
            else
                Toast.makeText(this ,"فیلد خالی است", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {

            frm1.visibility=View.VISIBLE
            frm2.visibility=View.GONE
        }
    }
}