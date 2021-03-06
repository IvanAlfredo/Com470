
package com.com470.p5app.service;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class TrianguloTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {4,4,4}, {3,4,5}, {3,7,3}
        });
    }
    
    @Parameter(0)
    public int v1;
    @Parameter(1)
    public int v2;
    @Parameter(2)
    public int v3;
    Triangulo triangulo = new Triangulo();

    @Test
    public void testTipoTriangulo() {
        
        String resultado;
        System.out.println("Para>>"+v1+" "+v2+" "+v3);
        String esperado1 = "Equilatero";
        String esperado2 = "Escaleno";
        String esperado3 = "Isosceles";
        resultado = triangulo.tipoTriangulo(v1, v2, v3);
        System.out.println(resultado);
        
        
        if(v1==4 && v2==4 && v3==4){
            assertEquals(esperado1, resultado);
        }
        if(v1==3 && v2==4 && v3==5){
            assertEquals(esperado2, resultado);
        }
        if(v1==3 && v2==7 && v3==3){
            assertEquals(esperado3, resultado);
        }
    }
    
        
}
