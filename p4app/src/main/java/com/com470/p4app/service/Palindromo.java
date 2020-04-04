
package com.com470.p4app.service;

public class Palindromo {
    
    public boolean Busca_palindromo(String cadena){
        cadena = cadena.toLowerCase();
        System.out.println("La cadena es:"+cadena);
        int largo_cadena = cadena.length();
        int rango = largo_cadena/2;
        boolean es_palindromo = true;
        if(largo_cadena%2==0){
            rango--;
        }
        for (int i = 0; i < rango; i++) {
            if(cadena.charAt(i) != cadena.charAt(largo_cadena-i-1)){
                es_palindromo = false;
            }
        }
        
        return es_palindromo;
    }
}
