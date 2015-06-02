/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author rzarzafernandez
 */
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LogicaParamTest {
   private Modelo mod;
   private float result;
   
   

   @Before
   public void initialize() {
   }

    public LogicaParamTest(Modelo mod, float result) {
        this.mod = mod;
        this.result = result;
    }

  

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         {new Modelo(2, 2, 1, 4),4},
         {new Modelo(1, 1, 2, 0),0},
         {new Modelo(3, 3, 3, 9),9},
         {new Modelo(10, 2, 4, 2),2}
         
      });
   }

   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + result);
      assertEquals(result,Logica.realizaOperacion(mod),0.0);
   }
}
