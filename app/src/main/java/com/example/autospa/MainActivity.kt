package com.example.autospa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val promociones= listOf(
    promociones(auto:"chevrolet", precio:"50" ,horario:"5pm",domicilio:"si")
    promociones(auto:"chevrolet", precio:"50" ,horario:"5pm",domicilio:"si")
    promociones(auto:"chevrolet", precio:"50" ,horario:"5pm",domicilio:"si")
    promociones(auto:"chevrolet", precio:"50" ,horario:"5pm",domicilio:"si")
    promociones(auto:"chevrolet", precio:"50" ,horario:"5pm",domicilio:"si")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}