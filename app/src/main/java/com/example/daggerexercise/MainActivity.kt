package com.example.daggerexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var kargo:Kargo
    private lateinit var internet: Internet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        kargo = Kargo()
        kargo.gonder()

        internet = Internet()
        internet.basvuruYap()
    }
}