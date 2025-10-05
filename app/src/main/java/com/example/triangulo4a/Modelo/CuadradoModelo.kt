package com.example.triangulo4a.Modelo

import com.example.triangulo4a.Contratos.ContratoCuadrado

class CuadradoModelo: ContratoCuadrado.Modelo {
    override fun area(lado: Float): Float {
        return lado * lado
    }

    override fun perimetro(lado: Float): Float {
        return lado * 4
    }

    override fun valida(lado: Float): Boolean {
        if(lado > 0)
            return true
        else
            return false

    }

}