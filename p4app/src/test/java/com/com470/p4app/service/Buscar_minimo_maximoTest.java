/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.Minimo_maximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franz
 */
public class Buscar_minimo_maximoTest {
    
    private Buscar_minimo_maximo utils = new Buscar_minimo_maximo();
    
    @Test
    public void testBusca_minimo_maximo_uno() {
        List<Integer> lista = Arrays.asList(3,2,1,55,2,4,8,20);
        Minimo_maximo resultado = utils.Busca_minimo_maximo(lista);
        Minimo_maximo esperado = new Minimo_maximo(1,55);
        //assertEquals(esperado, resultado);
        test(esperado, lista);
        
    }
    
    @Test
    public void testBusca_minimo_maximo_dos() {
        List<Integer> lista = Arrays.asList(3,2,1,-55,2,4,-8,200);
        Minimo_maximo resultado = utils.Busca_minimo_maximo(lista);
        Minimo_maximo esperado = new Minimo_maximo(-55,200);
        //assertEquals(esperado, resultado);
        test(esperado,lista);
        
    }

    private void test(Minimo_maximo esperado, List<Integer> lista) {
        assertEquals(esperado,utils.Busca_minimo_maximo(lista));
        assertThat(utils.Busca_minimo_maximo(lista), Matchers.equalTo(esperado));
        assertThat(utils.Busca_minimo_maximo(lista), Matchers.is(esperado));
        assertThat(utils.Busca_minimo_maximo(lista), Matchers.equalToObject(esperado));
    }
    
    
}
