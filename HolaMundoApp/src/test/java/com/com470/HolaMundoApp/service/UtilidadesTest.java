/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.HolaMundoApp.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franz
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }

    @Test
    public void testConcatenar() {
        System.out.println("Concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        //Instaciación de la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.Concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    
    //El fallo esta en la implementación
    @Test
    public void testConcatenarFallo() {
        System.out.println("Concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        //Instaciación de la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.Concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    
    //El error esta en la codificación
    @Test
    public void testConcatenarError() {
        System.out.println("Concatenar");
        String uno = null;
        String dos = "Mundo";
        //Instaciación de la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = null;
        String result = instance.Concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
