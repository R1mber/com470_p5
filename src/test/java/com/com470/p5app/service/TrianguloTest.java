
package com.com470.p5app.service;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TrianguloTest {
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{
            {1,2,3},{1,1,1},{2,2,2},{2,4,4}
        });
    }
    @Parameter(0)
    public int l1;
    @Parameter(1)
    public int l2;
    @Parameter(2)
    public int l3;
    Triangulo utils=new Triangulo();
    
    @Test
    public void testTipoTriangulo() {
        String resultado;
        System.out.println("para>>>"+l1+" v2:"+l2+" v3:"+l3);
        String esperado1="Equilatero";
        String esperado2="Isoceles";
        String esperado3="Escaleno";
        
        resultado=utils.tipoTriangulo(l1, l2, l3);
        
        if(l1 == l2 && l2 == l3){
           assertEquals(esperado1,resultado);
           System.out.println("equilatero");
        }else if(l1 == l2 || l1 == l3 || l2 == l3){
            assertEquals(esperado2,resultado);
            System.out.println("isoceles");
        }else if(l1 != l2 || l1 != l3 || l3 != l2){
            assertEquals(esperado3,resultado);
            System.out.println("escaleno");
        }
    }
}
