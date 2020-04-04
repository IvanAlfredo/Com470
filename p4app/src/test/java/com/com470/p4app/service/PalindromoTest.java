
package com.com470.p4app.service;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {
    
    private Palindromo utils;
    
    public PalindromoTest() {
    }
    
    @Before
    public void setUp() {
        
        utils = new Palindromo();
    }

    @Test
    public void testBuscaPalindromo() {
        String cadena = "Reconocer";
        boolean esperado = true;
        boolean resultado = utils.Busca_palindromo(cadena);
        assertEquals(esperado, resultado);
        assertThat(utils.Busca_palindromo("reconocer"), Matchers.is(true));
        assertThat(utils.Busca_palindromo("somos"), Matchers.equalTo(true));
        assertThat(utils.Busca_palindromo("pablo"), Matchers.is(false));
        //assertThat(utils.Busca_palindromo("reconocer"), Matchers.is(not(Matchers.is(true))));
        assertTrue(utils.Busca_palindromo("reconocer"));
        assertFalse(utils.Busca_palindromo("pedro"));
    }
}
