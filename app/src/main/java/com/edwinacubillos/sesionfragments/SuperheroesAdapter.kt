package com.edwinacubillos.sesionfragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edwinacubillos.sesionfragments.Superheroes
import kotlinx.android.synthetic.main.superheroes_item.view.*

class SuperheroesAdapter : RecyclerView.Adapter<SuperheroesAdapter.SuperheroesViewHolder> {

    private var listSuperheroes: List<Superheroes>? = null
    private var context: Context ? = null

    constructor (listSuperheroes: List<Superheroes>, context: Context){
        this.listSuperheroes = listSuperheroes
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroesViewHolder {
       var view = LayoutInflater.from(context).inflate(R.layout.superheroes_item,parent,false)
       return SuperheroesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSuperheroes?.size!!
    }

    override fun onBindViewHolder(holder: SuperheroesViewHolder, position: Int) {
        var superheroes = listSuperheroes!![position]
        holder.loadItem(superheroes)
    }

    class SuperheroesViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun loadItem(superheroes: Superheroes){
            itemView.tNombre.text = superheroes.nombre
            itemView.iFoto.setImageResource(superheroes.foto)
        }
    }
}