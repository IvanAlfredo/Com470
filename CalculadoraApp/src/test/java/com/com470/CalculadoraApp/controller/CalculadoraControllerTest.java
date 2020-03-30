/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.CalculadoraApp.controller;

import com.com470.CalculadoraApp.model.Modelo_Operacion;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;

/**
 *
 * @author Franz
 */
public class CalculadoraControllerTest {
    
    public CalculadoraControllerTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("Suma");
        Modelo_Operacion OperacionModelo = null;
        Model model = null;
        CalculadoraController instance = new CalculadoraController();
        String expResult = "";
        String result = instance.add(OperacionModelo, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class CalculadoraController.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        Modelo_Operacion OperacionModelo = null;
        Model model = null;
        CalculadoraController instance = new CalculadoraController();
        String expResult = "";
        String result = instance.subtract(OperacionModelo, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class CalculadoraController.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        Modelo_Operacion OperacionModelo = null;
        Model model = null;
        CalculadoraController instance = new CalculadoraController();
        String expResult = "";
        String result = instance.multiply(OperacionModelo, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculadoraController.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        Modelo_Operacion OperacionModelo = null;
        Model model = null;
        CalculadoraController instance = new CalculadoraController();
        String expResult = "";
        String result = instance.divide(OperacionModelo, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
