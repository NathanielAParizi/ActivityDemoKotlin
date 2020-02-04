package com.example.activitydemokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_data_entry.*

class DataEntry : AppCompatActivity() {

    lateinit var passedIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry)

        passedIntent = intent
    }

    fun onClick(view: View) {

        when (view.id) {
            R.id.btn -> {
                val make = etMake.text.toString()
                val model = etModel.text.toString()
                val year = etYear.text.toString()
                val color = etColor.text.toString()
                val userEnteredCar = Car(make, model, year, color)

                passedIntent.putExtra("CAR", userEnteredCar)

                setResult(321, passedIntent)
                finish()

            }


        }


    }


}
