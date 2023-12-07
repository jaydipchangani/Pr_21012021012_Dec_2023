package com.example.pr_21012021012_dec_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.provider.CallLog
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.button_msg)
        btn.setOnClickListener{
            showMessage("Hello Sir, This is 21012021012")
        }

        val call : Button=findViewById(R.id.call_button)
        call.setOnClickListener {
            CallLog()
        }

    }

    fun showMessage(message: String){
        val tag="Hello there 21012021012"
        Log.i(tag, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout?=findViewById(R.id.myConstraintLayout)
        if(v != null)
        {
            Snackbar.make(v, message,Snackbar.LENGTH_SHORT).show()
        }
    }

    fun CallLog() {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {
            startActivity(it) }
    }

}


