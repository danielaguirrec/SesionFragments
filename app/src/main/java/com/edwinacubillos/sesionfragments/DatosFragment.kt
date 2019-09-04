package com.edwinacubillos.sesionfragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_datos.view.*

class DatosFragment : Fragment() {

    private lateinit var user: User

    var listUsers: ArrayList<User> = ArrayList()
    private var data = ""

   override fun onResume() {
        super.onResume()
       Log.d("onResume", "ok")
       listUsers.clear()
        if (arguments != null) {
            listUsers = arguments!!.getParcelableArrayList(ARG_PARAM)

            for (user in listUsers) {
                data = data + user.nombre + " - " + user.cedula + "\n"
            }
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "ok")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_datos, container, false)
        listUsers.clear()
        if (arguments != null) {
            listUsers = arguments!!.getParcelableArrayList(ARG_PARAM)

            for (user in listUsers){
                data = data + user.nombre + " - " + user.cedula +"\n"
            }

            view.tNombre.text = data

            /*var user: User = arguments!!.getParcelable(ARG_PARAM)

            var nombre = user.nombre
            var cedula = user.cedula

            view.tNombre.text = nombre
            view.tCedula.text = cedula*/
        }

        return view
    }

    companion object {
        private val ARG_PARAM = "MyObject"

        fun newInstance(userList: ArrayList<User>): DatosFragment {
            val datosFragment = DatosFragment()
            val args = Bundle()
            args.putParcelableArrayList(ARG_PARAM, userList)
            datosFragment.arguments = args
            return datosFragment
        }
    }
}
