
package com.com470.p4app.service;

import com.com470.p4app.model.Minimo_maximo;
import java.util.List;


public class Buscar_minimo_maximo {
    
    public Minimo_maximo Busca_minimo_maximo(List<Integer> lista){
        int smallest = lista.get(0);
        int largest = lista.get(0);
        System.out.println("La lista es>>" + lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < smallest){
                smallest = lista.get(i);
            }
            if(lista.get(i) > largest){
                largest = lista.get(i);
            }
        }
        System.out.println("El valor minimo es>>" + smallest);
        System.out.println("El valor maximo es>>" + largest);
        
        return new Minimo_maximo(smallest, largest);
    }
}
