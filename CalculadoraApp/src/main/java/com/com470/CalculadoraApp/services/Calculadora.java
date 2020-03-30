package com.com470.CalculadoraApp.services;

import com.com470.CalculadoraApp.model.Modelo_Operacion;


public class Calculadora {
    
    public int suma(Modelo_Operacion modelo){
        return modelo.getA()+modelo.getB();
    }
    
    public int resta(Modelo_Operacion modelo){
        return modelo.getA()-modelo.getB();
    }
    
    public int multiplicacion(Modelo_Operacion modelo){
        return modelo.getA()*modelo.getB();
    }
    
    public double division(Modelo_Operacion modelo){
        if(modelo.getA()==0){
            return 0;
        }
        if(modelo.getB()==0){
            return 0;
        }
        return (double)modelo.getA()/modelo.getB();
    }
}
