package com.example.lrodriguezbarroncas.fragmentproyect

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.fragment_detalle.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class Detalle : Fragment() {
    // TODO: Rename and change types of parameters



    companion object {
        //Se puede llamar desde otra clase.
        fun newInstance(): Detalle {

            return Detalle()

        }

    }
    //Metodo que va a recibir parametros desde la activity y se ejecutara cuando le demos al boton tambien en la Activity
    fun suma(n1: Int, n2: Int):Int{
        //devuelve el resultado de la suma
        return n1+n2

    }
    fun resta(n1:Int,n2:Int):Int{
        //Devuelve la resta, también la tengo tratada para que nunca de negativo
        //if(n1>=n2){
            return n1-n2
        //}else{
          //  return n2-n1
       // }

    }
    fun multi(n1:Int,n2:Int):Int{
        //Devuelve el resultado de la multiplicación
        return n1*n2
    }

    fun divi(n1:Int, n2:Int):Int{
        //Devuelve el resultado de la división sin decimales
            return n1/n2

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Carga el fragment en el layout
        return inflater.inflate(R.layout.fragment_detalle, container, false)
    }




}
