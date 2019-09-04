package com.edwinacubillos.sesionfragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 *
 */
class BatmanFragment : Fragment() {

    private lateinit var title: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_batman, container, false)

        title = view.findViewById(R.id.titleBatman)
        return view
    }

    fun sendData(nombre: String, cedula: String) {
        title.text = nombre
    }
}
