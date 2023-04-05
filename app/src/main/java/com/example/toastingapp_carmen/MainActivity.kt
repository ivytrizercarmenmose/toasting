package com.example.toastingapp_carmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   //instantiate - giving it a name as a variable

    private lateinit var display_text:TextView
    private lateinit var submitbutton :Button
    private lateinit var secondbutton:Button
    private lateinit var edt_input_data:EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.disdtext)
        submitbutton = findViewById(R.id.btnsubmit)
        secondbutton = findViewById(R.id.btnsecond)
        edt_input_data = findViewById(R.id.edtdata)


        secondbutton.setOnClickListener {
            Toast.makeText(this, "Clicked the second button", Toast.LENGTH_SHORT).show()
        }
        submitbutton.setOnClickListener {
            //grab info from edit text
              var user_data = edt_input_data.text.toString().trim()
            Toast.makeText(this, user_data, Toast.LENGTH_SHORT).show()
        }

    }
}