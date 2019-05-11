package com.felipejose.chronometerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cronologico = findViewById<Chronometer>(R.id.cronologico) as Chronometer
        val iniciar = findViewById<Button>(R.id.iniciar) as Button
        val parar = findViewById<Button>(R.id.parar) as Button

        iniciar.setOnClickListener {
            cronologico.base = SystemClock.elapsedRealtime()
            cronologico.start()
        }
        parar.setOnClickListener {
            cronologico.stop()
        }
    }
}
