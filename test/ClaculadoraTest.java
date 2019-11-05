/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ClaculadoraTest {
    
    public ClaculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSuma(){
        int total = 8;
        int sum = Calculadora.suma(4,4);
        assertEquals(sum,total);
    }
    
    @Test
    public void testResta(){
        int total = 0;
        int sub = Calculadora.resta(4,4);
        assertEquals(sub,total);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
