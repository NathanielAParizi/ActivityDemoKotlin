package com.example.activitydemokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.DisplayActivity

val someValue = ""  //Initialized at run time

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG_MAIN_ACTIVITY, "onCreate")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.v(TAG_MAIN_ACTIVITY, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.v(TAG_MAIN_ACTIVITY, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.v(TAG_MAIN_ACTIVITY, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.v(TAG_MAIN_ACTIVITY, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.v(TAG_MAIN_ACTIVITY, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.v(TAG_MAIN_ACTIVITY, "onDestroy")
        super.onDestroy()
    }

    fun onClick(view: View) {

        when(view.id){
            R.id.startDisplayBtn -> {
                val intent = Intent(this, DisplayActivity::class.java)
                startActivity(intent)
            }
            R.id.dataEntryBtn -> {
                val intent = Intent(this, DataEntry::class.java)
                startActivityForResult(intent,123)
            }

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.v(TAG_DISPLAY_ACITIVTY,data?.getParcelableExtra<Car>("CAR").toString())

    }
}
