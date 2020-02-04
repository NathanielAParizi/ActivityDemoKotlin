package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitydemokotlin.R
import com.example.activitydemokotlin.TAG_DISPLAY_ACITIVTY
import com.example.activitydemokotlin.TAG_MAIN_ACTIVITY

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG_DISPLAY_ACITIVTY,"onCreate")
        setContentView(R.layout.activity_display)

    }

    override fun onStart() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.v(TAG_DISPLAY_ACITIVTY, "onDestroy")
        super.onDestroy()
    }

}
