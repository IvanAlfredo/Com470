
package com.com470.CalculadoraApp.model;


public class Modelo_Operacion {
    private String Operacion;
    private int a;
    private int b;
    private int c;

    public Modelo_Operacion() {
    }

    public Modelo_Operacion(int c) {
        this.c = c;
    }

    public Modelo_Operacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public Modelo_Operacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
}
