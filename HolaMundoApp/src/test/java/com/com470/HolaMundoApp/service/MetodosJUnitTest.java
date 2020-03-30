/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.HolaMundoApp.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franz
 */
public class MetodosJUnitTest {
    
    public MetodosJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        System.out.println("Antes de todos los test \n");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        System.out.println("Despues de todos los test");
        fail("The test case is a prototype.");
        
    }
    
    @Before
    public void setUp() {
        
        System.out.println("Antes de cada test");
        
    }
    
    @After
    public void tearDown() {
        
        System.out.println("Despues de cada test \n"); 
            
    }

    @Test
    public void Primer_test() {
        System.out.println("Primer test");
//        String uno = "";
//        String dos = "";
//        Utilidades instance = new Utilidades();
//        String expResult = "";
//        String result = instance.Concatenar(uno, dos);
//        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
        @Test
    public void Segundo_test() {
        System.out.println("Segundo test");
//        String uno = "";
//        String dos = "";
//        Utilidades instance = new Utilidades();
//        String expResult = "";
//        String result = instance.Concatenar(uno, dos);
//        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
