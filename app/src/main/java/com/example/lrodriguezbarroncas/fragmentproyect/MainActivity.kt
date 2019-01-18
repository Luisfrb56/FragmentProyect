package com.example.lrodriguezbarroncas.fragmentproyect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.fragment_detalle.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.flfrag, Detalle.newInstance(), "Detalle")
                .commit()



        }


    //boton que manda los parametros y llama al metodo suma antes de mostrarlo por pantalla
    bSuma.setOnClickListener{

            val miFrag = Detalle.newInstance()
        val num1 =etN1.text.toString()
        val num2 =etN2.text.toString()
            val resultado = miFrag.suma(num1.toInt(), num2.toInt())
            tresult.setText("Resultado: " + resultado)

    }
        //Boton resta que manda los parametros y muestra el resultado en el Fragment
        bResta.setOnClickListener{

            val miFrag = Detalle.newInstance()
            val num1 =etN1.text.toString()
            val num2 =etN2.text.toString()
            val resultado = miFrag.resta(num1.toInt(), num2.toInt())
            tresult.setText("Resultado: " + resultado)

        }
        //Boton multiplicación que manda los parametros y muestra el resultado en el Fragment
        bMulti.setOnClickListener{

            val miFrag = Detalle.newInstance()
            val num1 =etN1.text.toString()
            val num2 =etN2.text.toString()
            val resultado = miFrag.multi(num1.toInt(), num2.toInt())
            tresult.setText("Resultado: " + resultado)

        }
        //Boton division que manda los parametros y muestra el resultado en el Fragment
        bDivi.setOnClickListener{

            val miFrag = Detalle.newInstance()
            val num1 =etN1.text.toString()
            val num2 =etN2.text.toString()
            val resultado = miFrag.divi(num1.toInt(), num2.toInt())
            tresult.setText("Resultado: " + resultado)

        }

    }



}
