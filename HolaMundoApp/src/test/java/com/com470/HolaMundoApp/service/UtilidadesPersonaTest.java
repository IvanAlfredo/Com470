package com.com470.HolaMundoApp.service;

import com.com470.HolaMundoApp.model.Persona;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesPersonaTest {
    
    private UtilidadesPersona utils = new UtilidadesPersona();
    public UtilidadesPersonaTest() {
    }

    @Test
    public void testGetCarlos() {
        //Cuando
        Persona carlos = utils.getCarlos();
        //Entonces
        assertEquals("Carlos", carlos.getNombre());
        assertEquals("Romero", carlos.getApellido());
    }
    
    @Test
    public void testGetJuan() {
        //Cuando
        Persona juan = utils.getJuan();
        //Entonces
        assertEquals("Juan", juan.getNombre());
        assertEquals("Perez", juan.getApellido());
    }
    
    @Test
    public void testPersonasDiferentes() {
        //Cuando
        Persona carlos = utils.getCarlos();
        Persona juan = utils.getJuan();
        //Entonces
        assertEquals("Juan", juan.getNombre());
        assertNotEquals(juan, carlos);
    }
    
}
