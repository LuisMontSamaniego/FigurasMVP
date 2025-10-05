package com.example.triangulo4a.Contratos

interface ContratoCuadrado {
    interface Modelo{
        fun area(lado: Float): Float
        fun perimetro(lado: Float): Float
        fun valida(lado: Float): Boolean
    }
    interface Vista{
        fun showArea(area: Float)
        fun showPerimetro(perimetro: Float)
        fun showError(msg: String)
    }
    interface Presentador{
        fun area(lado: Float)
        fun perimetro(lado: Float)
    }
}