package com.edwinacubillos.sesionfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_datos.view.*

class DatosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_datos, container, false)

        var nombre = arguments?.getString("nombre")
        var cedula = arguments?.getString("cedula")

        view.tNombre.text = nombre
        view.tCedula.text = cedula


        return view
    }
}
