package com.com470.p5app.service;

public class Triangulo {

    public String tipoTriangulo(int l1, int l2, int l3) {
        String resultado = "Sin resultado";
        if (l1 == l2 && l2 == l3) {
            resultado = "Equilatero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                resultado = "Isosceles";
            } else if (l1 != l2 || l1 != l3 || l3 != l2) {
                    resultado = "Escaleno";
                }
        return resultado;
    }
}
