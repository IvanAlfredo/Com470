package com.com470.HolaMundoApp.service;

import com.com470.HolaMundoApp.model.Persona;


public class UtilidadesPersona {
    private Persona carlos;
    private Persona juan;

    public UtilidadesPersona() {
        
        carlos = new Persona("Carlos", "Romero");
        juan = new Persona("Juan", "Perez");
        
    }

    public Persona getCarlos() {
        return carlos;
    }

    public Persona getJuan() {
        return juan;
    }
    
    
    
    
}
