package com.com470.ValidarEmailApp.sevices;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarEmailTest {
    
    private ValidarEmail email = new ValidarEmail();
    
    public ValidarEmailTest() {
    }

    /**
     * Test of getInstance method, of class ValidarEmail.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ValidarEmail expResult = null;
        ValidarEmail result = ValidarEmail.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validaEmail method, of class ValidarEmail.
     */
    @Test
    public void testValidaEmail() {
        System.out.println("validar Email");
        String email = "validar@gmail.com";
        ValidarEmail instance = new ValidarEmail();
        boolean expResult = true;
        boolean result = instance.validaEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of reset method, of class ValidarEmail.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        ValidarEmail instance = new ValidarEmail();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
