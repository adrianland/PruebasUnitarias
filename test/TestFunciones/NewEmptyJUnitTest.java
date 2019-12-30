package TestFunciones;

import org.junit.Test;
import static org.junit.Assert.*;
import Funciones.Numericos;

public class NewEmptyJUnitTest {
    
    @Test 
    public void getDoble(){
       int resultado = Numericos.getDoble(4);
        int esperado = 8;
        assertEquals("si",esperado, resultado);
    }
    
     @Test 
    public void getCuadreado(){
        int resultado = Numericos.getCuadreado(5);
        int esperado = 25;
        assertEquals(esperado, resultado);
    }
    
     @Test 
    public void getSuma(){
        int resultado = Numericos.getSuma(5,5);
        int esperado = 10;
        assertEquals(esperado, resultado);
    }
    
     @Test 
    public void getResta(){
        int resultado = Numericos.getResta(10,8);
        int esperado = 2;
        assertEquals(esperado, resultado);
    }
    
     @Test 
    public void getMultiplicacion(){
        int resultado = Numericos.getMultiplicacion(2,8);
        int esperado = 16;
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void getDivicion(){
        int resultado = Numericos.getDivicion(20,4);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }
    
    
}
