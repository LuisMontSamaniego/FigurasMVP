package com.example.triangulo4a.Contratos

interface ContratoCirculo {
    interface Modelo{
        fun area(radio: Float): Float
        fun perimetro(radio: Float): Float
        fun valida(radio: Float): Boolean
    }
    interface Vista{
        fun showArea(area: Float)
        fun showPerimetro(perimetro: Float)
        fun showError(msg: String)
    }
    interface Presentador{
        fun area(radio: Float)
        fun perimetro(radio: Float)
    }
}