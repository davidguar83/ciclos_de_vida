package com.dam2david.ciclos_de_vida

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprime Log
        Log.d("Estado","IMPRIME onCreate")
    }


    override fun onStart() {
        super.onStart()
        // Imprime Log
        Log.d("Estado", "IMPRIME onStart")

    }

    override fun onResume() {
        super.onResume()
        // Imprime Log
        Log.d("Estado", "IMPRIME onResume")
    }

    override fun onRestart() {
        super.onRestart()
        // Imprime Log
        Log.d("Estado", "IMPRIME onRestart")
    }

    override fun onPause() {
        super.onPause()
        // Imprime Log
        Log.d("Estado", "IMPRIME onPause")


    }

    override fun onStop() {
        super.onStop()
        // Imprime Log
        Log.d("Estado", "IMPRIME onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Imprime Log
        Log.d("Estado", "IMPRIME onDestroy")
    }
}