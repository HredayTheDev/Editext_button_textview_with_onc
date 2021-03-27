package com.softvally.edittext_button_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textView: TextView

    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var button2: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById(R.id.textView)

        editText=findViewById(R.id.editTextTextPersonName)

        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)



    }

    override fun onClick(v: View?) {

        when(v?.id){

            R.id.button ->{

                val editName=editText.text.toString()

                textView.setText("Hello Hreday  $editName")


            }


            R.id.button2 ->{

                val editName=editText.text.toString()

                textView.setText("Hello Hreday  $editName,Are you an android developer?")

            }

        }



    }
}