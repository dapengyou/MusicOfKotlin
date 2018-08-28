package com.test.musicofkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var navigationView: NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("123", "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.d("123", "onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("123", "onRestoreInstanceState")

    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.d("123", "onContentChanged")

    }

    override fun onPause() {
        super.onPause()
        Log.d("123", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("123", "onStart")

    }

    override fun onStop() {
        super.onStop()
        Log.d("123", "onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("123", "onRestart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("123", "onResume")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("123", "onDestroy")

    }
}
