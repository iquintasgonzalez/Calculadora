/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rzarzafernandez
 */
public class LogicaTest {
    
    public LogicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        Modelo mod = new Modelo(2, 2, 1, 4);
        Logica instance = new Logica();
        float expResult = 4.0F;
        float result = instance.realizaOperacion(mod);
        assertEquals(expResult, result, 0.0);
        
    }
    
}