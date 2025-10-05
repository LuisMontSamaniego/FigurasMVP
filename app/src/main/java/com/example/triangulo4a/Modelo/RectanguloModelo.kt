package com.example.triangulo4a.Modelo

import com.example.triangulo4a.Contratos.ContratoRectangulo

class RectanguloModelo: ContratoRectangulo.Modelo {
    override fun area(base: Float, altura: Float): Float {
        return base*altura
    }

    override fun perimetro(base: Float, altura: Float): Float {
        return (base+altura)*2
    }

    override fun valida(base: Float, altura: Float): Boolean {
        if(base == altura && base>0 && altura>0)
            return true
        else
            return false

    }
}