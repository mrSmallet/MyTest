package com.example.sergey.mytest

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity(), View.OnClickListener{
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button -> {Toast.makeText(this,"gggg",Toast.LENGTH_SHORT).show()
            textView.setText("OK")}

        }

    }

     lateinit var  st: String
    lateinit var button : Button
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener(this)

    }
}
