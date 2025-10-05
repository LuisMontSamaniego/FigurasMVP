package com.example.triangulo4a.Modelo

import com.example.triangulo4a.Contratos.ContratoTriangulo
import kotlin.math.sqrt

class TrianguloModelo: ContratoTriangulo.Modelo {
    override fun area(l1: Float, l2: Float, l3: Float): Float {
        val s=(l1+l2+l3)/2
        return sqrt(s*(s-l1)*(s-l2)*(s-l3))
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float): Float {
        return l1+l2+l3
    }

    override fun tipo(l1: Float, l2: Float, l3: Float): String {
        if(l1==l2 && l2==l3 )
            return "\n El Tipo de trianfulo es Equilatero"
        else if(l1!=l2 && l2!=l3 && l1!=l3)
            return "\n El Tipo de trianfulo es escaleno"
        else
            return "\n El Tipo de trianfulo es isoceles"
    }

    override fun valida(l1: Float, l2: Float, l3: Float): Boolean {
        if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1 && l1>0 && l2>0 && l3>0)
            return true
        else
            return false
    }
}