package com.edwinacubillos.sesionfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val supermanFragment = SupermanFragment()
        transaction.add(R.id.contenedor, supermanFragment).commit()
    }
}
