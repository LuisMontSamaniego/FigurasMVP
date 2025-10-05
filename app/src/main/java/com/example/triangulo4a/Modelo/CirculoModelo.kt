package com.example.triangulo4a.Modelo

import com.example.triangulo4a.Contratos.ContratoCirculo
import kotlin.math.PI

class CirculoModelo: ContratoCirculo.Modelo {
    override fun area(radio: Float): Float {
        return ((PI * radio * radio).toFloat())
    }

    override fun perimetro(radio: Float): Float {
        val diametro: Float = radio*2
        return ((PI*diametro).toFloat())
    }

    override fun valida(radio: Float): Boolean {
        if(radio > 0)
            return true
        else
            return false
    }

}