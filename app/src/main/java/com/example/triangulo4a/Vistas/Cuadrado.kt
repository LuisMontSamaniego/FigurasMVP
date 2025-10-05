package com.example.triangulo4a.Vistas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4a.Contratos.ContratoCuadrado
import com.example.triangulo4a.Presentador.CuadradoPresenter
import com.example.triangulo4a.R

class Cuadrado : AppCompatActivity(), ContratoCuadrado.Vista {

    //declaramos el textarea del resultado para poder manipularlo desde las funciones del contrato
    //de la vista
    private lateinit var txvResultado: TextView
    private lateinit var presentador: ContratoCuadrado.Presentador

    fun setPresentador(presentador: ContratoCuadrado.Presentador){
        this.presentador=presentador
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cuadrado)

        //inicializamos elemento a utilizar
        val txtLado: EditText = findViewById<EditText>(R.id.edtLado)
        val btnArea: Button =findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button =findViewById<Button>(R.id.btnPerimetro)
        txvResultado=findViewById<TextView>(R.id.txvRes)

        //definimos el presentardor
        presentador= CuadradoPresenter(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //listener del boton para calcular el area llamando a una funcion
        btnArea.setOnClickListener{
            val lado=txtLado.text.toString().toFloat()
            presentador.area(lado)
        }

        //listener del boton para calcular el perimetro llamando a una funcion
        btnPerimetro.setOnClickListener{
            val lado=txtLado.text.toString().toFloat()
            presentador.perimetro(lado)
        }
    }

    override fun showArea(area: Float) {
        txvResultado.text="El area es ${area}"
    }

    override fun showPerimetro(perimetro: Float) {
        txvResultado.text="El perimetro es ${perimetro}"
    }

    override fun showError(msg: String) {
        txvResultado.text=msg
    }
}