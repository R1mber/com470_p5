
package com.com470.p5app.service;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{
            {4,2}
        });
    }
    @Parameterized.Parameter(0)
    public int n1;
    @Parameterized.Parameter(1)
    public int n2;
    Calculadora utils=new Calculadora();
    
    @Test
    public void testSuma() {
       int resultado;
       int esperado=6;
       resultado=utils.suma(n1, n2);
       assertEquals(esperado,resultado);
    }

    @Test
    public void testResta() {
     int resultado;
       int esperado=2;
       resultado=utils.resta(n1, n2);
       assertEquals(esperado,resultado);
    }

    @Test
    public void testMultimplicacion() {
       int resultado;
       int esperado=8;
       resultado=utils.multimplicacion(n1, n2);
       assertEquals(esperado,resultado);
    }

    @Test
    public void testDivision() {
       int resultado;
       int esperado=2;
       resultado=utils.division(n1, n2);
       if(n1==0){
           System.out.println("no se puede dividir entre cero");
       }else
       assertEquals(esperado,resultado);
    }
    
}
