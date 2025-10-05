package com.example.triangulo4a.Presentador

import com.example.triangulo4a.Contratos.ContratoRectangulo
import com.example.triangulo4a.Modelo.RectanguloModelo

class RectanguloPresenter(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador{
    private val modelo: ContratoRectangulo.Modelo = RectanguloModelo()

    override fun area(base: Float, altura: Float) {
        if(modelo.valida(base, altura)==true){
            val a= modelo.area(base, altura)
            vista.showArea(a)
        }else{
            vista.showError("Datos incorrectos")
        }
    }

    override fun perimetro(base: Float, altura: Float) {
        if(modelo.valida(base, altura)==true){
            val p= modelo.perimetro(base, altura)
            vista.showPerimetro(p)
        }else{
            vista.showError("Datos incorrectos")
        }
    }
}