package com.example.triangulo4a.Vistas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4a.Contratos.ContratoRectangulo
import com.example.triangulo4a.Presentador.RectanguloPresenter
import com.example.triangulo4a.R

class Rectangulo : AppCompatActivity(), ContratoRectangulo.Vista {

    //declaramos el textarea del resultado para poder manipularlo desde las funciones del contrato
    //de la vista
    private lateinit var txvResultado: TextView
    private lateinit var presentador: ContratoRectangulo.Presentador

    fun setPresentador(presentador: ContratoRectangulo.Presentador){
        this.presentador=presentador
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rectangulo)

        //inicializamos elemento a utilizar
        val txtBase: EditText =findViewById<EditText>(R.id.edtBase)
        val txtAltura: EditText =findViewById<EditText>(R.id.edtAltura)
        val btnArea: Button =findViewById<Button>(R.id.btnArea)
        val btnPerimetro: Button =findViewById<Button>(R.id.btnPerimetro)
        val btnVolver: Button =findViewById<Button>(R.id.btnVolver)
        txvResultado=findViewById<TextView>(R.id.txvRes)

        //definimos el presentardor
        presentador= RectanguloPresenter(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //listener del boton para calcular el area llamando a una funcion
        btnArea.setOnClickListener{
            val base=txtBase.text.toString().toFloat()
            val altura=txtAltura.text.toString().toFloat()
            presentador.area(base,altura)
        }

        //listener del boton para calcular el perimetro llamando a una funcion
        btnPerimetro.setOnClickListener{
            val base=txtBase.text.toString().toFloat()
            val altura=txtAltura.text.toString().toFloat()
            presentador.perimetro(base,altura)
        }
        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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