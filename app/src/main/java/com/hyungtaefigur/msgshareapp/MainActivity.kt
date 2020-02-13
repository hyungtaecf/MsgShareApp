package com.hyungtaefigur.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener(){
            Log.i("MainActivity","Button was clicked!")
            txvTest.text = etUserMessage.text.toString()
            Toast.makeText(this,"Button was clicked!",Toast.LENGTH_SHORT).show()
        }

        btnSendMsgNextActivity.setOnClickListener(){
            val message: String = etUserMessage.text.toString()

            //val intent = Intent(this, SecondActivity::class.java)
            val intent = Intent(this, AnotherActivity::class.java)

            intent.putExtra("user_message", message)

            startActivity(intent)
        }

    }
}
