
package com.com470.CalculadoraApp.services;

import com.com470.CalculadoraApp.model.Modelo_Operacion;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @org.junit.Test
    public void testSuma() {
        System.out.println("Suma");
        Modelo_Operacion modelo = new Modelo_Operacion(4,6);
        Calculadora instance = new Calculadora();
        int expResult = 10;
        int result = instance.suma(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @org.junit.Test
    public void testResta() {
        System.out.println("Resta");
        Modelo_Operacion modelo = new Modelo_Operacion(15,5);
        Calculadora instance = new Calculadora();
        int expResult = 10;
        int result = instance.resta(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @org.junit.Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        Modelo_Operacion modelo = new Modelo_Operacion(5,2);
        Calculadora instance = new Calculadora();
        int expResult = 10;
        int result = instance.multiplicacion(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @org.junit.Test
    public void testDivision() {
        System.out.println("Division");
        Modelo_Operacion modelo = new Modelo_Operacion(20,2);
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.division(modelo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.Test
    public void testErrorDivision() {
        System.out.println("Division");
        Modelo_Operacion modelo = new Modelo_Operacion(20,0);
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.division(modelo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
