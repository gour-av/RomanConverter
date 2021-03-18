package com.api_task.romanconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // var roman:String? = "XI"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }



    private fun initViews() {

       btn_integer.setOnClickListener(View.OnClickListener {

           var number_integer:Int?=null
           var roman_numeral:String?=null
           roman_numeral = ed_roman.text.toString()

         number_integer =    NumberConverter.romanConvert(roman_numeral)
           tv_res.text = roman_numeral
           tv_integer.text = number_integer.toString()
       })

    }
}