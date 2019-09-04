package com.edwinacubillos.sesionfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.fragment_superman.view.*
import java.lang.ClassCastException

/**
 * A simple [Fragment] subclass.
 *
 */
class SupermanFragment : Fragment() {

    var interfaz: comunicador ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_superman, container, false)

        view.fotoSuperman.setOnClickListener{
            interfaz?.enviarDatos("Edwin", "867986")
        }
        return view

    }
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try{
            interfaz = context!! as comunicador
        } catch (e: ClassCastException){
            Log.d("exception", e.toString());
        }
    }


}
