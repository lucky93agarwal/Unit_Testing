package com.msl.myunittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var tvmobile : EditText
    lateinit var tvpass : EditText
    lateinit var btn : AppCompatButton
    lateinit var checkTerms: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkTerms = findViewById<CheckBox>(R.id.termsCB)

        tvmobile = findViewById<EditText>(R.id.mobileNoET)
        tvpass = findViewById<EditText>(R.id.passwordET)

        btn = findViewById<AppCompatButton>(R.id.loginBtn)

        btn.setOnClickListener(View.OnClickListener {
            var data : String? = LoginUtils.validation(tvmobile.text.toString(),tvpass.text.toString(),checkTerms.isChecked)
            if (data != null) {
                if(data.isNotEmpty()){
                    Toast.makeText(this,data,Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show()
            }
        })
    }
}