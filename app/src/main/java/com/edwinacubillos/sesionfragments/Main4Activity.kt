package com.edwinacubillos.sesionfragments

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

//Bottom Navigation

class Main4Activity : AppCompatActivity(), comunicador {

    private lateinit var user : User

    private var listUsers : ArrayList<User> = ArrayList()

    override fun enviarDatos(nombre: String, cedula: String) {
        user = User(nombre, cedula)

        listUsers.add(user)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val formFragment = FormFragment()
        transaction.replace(R.id.contenedor, formFragment).commit()



     /*   val supermanFragment = SupermanFragment()
        transaction.add(R.id.contenedor, supermanFragment).commit()*/

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        when (item.itemId) {
            R.id.navigation_superman -> {
                val formFragment = FormFragment()
                transaction.replace(R.id.contenedor, formFragment).commit()
                /*    val supermanFragment = SupermanFragment()
                    transaction.replace(R.id.contenedor, supermanFragment).commit()*/
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_batman -> {
                transaction.replace(R.id.contenedor, DatosFragment.newInstance(listUsers)).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_flash -> {
                transaction.replace(R.id.contenedor, DatosFragment.newInstance(listUsers)).commit()

                /*    val flashFragment = FlashFragment()
                    transaction.replace(R.id.contenedor, flashFragment).commit()*/
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
