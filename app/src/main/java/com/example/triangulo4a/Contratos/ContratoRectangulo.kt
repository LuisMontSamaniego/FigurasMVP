package com.example.triangulo4a.Contratos

interface ContratoRectangulo {

    interface Modelo{
        fun area(base: Float, altura: Float): Float
        fun perimetro(base: Float, altura: Float): Float
        fun valida(base: Float, altura: Float): Boolean
    }
    interface Vista{
        fun showArea(area: Float)
        fun showPerimetro(perimetro: Float)
        fun showError(msg: String)
    }
    interface Presentador{
        fun area(base: Float, altura: Float)
        fun perimetro(base: Float, altura: Float)
    }

}