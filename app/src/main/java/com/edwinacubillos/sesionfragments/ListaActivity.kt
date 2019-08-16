package com.edwinacubillos.sesionfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        var superheroes:MutableList<Superheroes> = ArrayList()


        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        superheroes.add(Superheroes("Superman",R.drawable.superman))
        superheroes.add(Superheroes("Batman", R.drawable.batman))
        superheroes.add(Superheroes("Flash", R.drawable.flash))
        

        recyclerView =  findViewById(R.id.recycler) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this, RecyclerView.VERTICAL, false
        )
        val superheroesAdapter = SuperheroesAdapter(superheroes!!,this)

        recyclerView.adapter = superheroesAdapter
    }
}
