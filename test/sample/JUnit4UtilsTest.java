/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author sperper2907
 */
public class JUnit4UtilsTest {
    
    
    
    public JUnit4UtilsTest() {
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

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = null;
        String expResult = "";
        String result = JUnit4Utils.concatWords(words);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException {
      final int factorialOf = 1 + (int)(30000*Math.random()); 
      
      System.out.println("informatica" + factorialOf + "!");
      
      System.out.println(factorialOf+"!="+JUnit4Utils.computeFactorial(factorialOf));
    }
    
    
    @Test
    public void checkExpectedException(){
        final int factorialOf = -5;
        System.out.println(factorialOf+"!="+JUnit4Utils.computeFactorial(factorialOf));
    }
    
    

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = JUnit4Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test que comprueba si funcinal el metodo concatWords haciendo un "Hello, World!"
     */
    @Test
    public void testHelloWorld(){
        System.out.println("*UtilsJUnit3Test:test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", JUnit4Utils.concatWords("Hello",","," world","!"));
    }
    
}
