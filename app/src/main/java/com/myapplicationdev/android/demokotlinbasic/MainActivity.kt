package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener{
            val userDOB = etDOB.text.toString()
            if (userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                var output = ""
                output = when (age) {
                    in 18..65 -> "Underage"
                    in 18..65 -> "Young Adult"
                    in 18..65 -> "Middle Aged"
                    in 18..65 -> "Elderly"
                    else -> {
                        "Long-lived elderly"
                    }
                }
                tvShowAge.text = "Your age is $age \n $output"
            } else {
                Toast.makeText(this, "Please enter your birth year.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}