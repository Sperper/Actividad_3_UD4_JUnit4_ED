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

/**
 *
 * @author sperper2907
 */
public class JUnit4VectorsTest {
    
    public JUnit4VectorsTest() {
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
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
        System.out.println("vectorsJUnit3Test:testEqual()");
        assertTrue(JUnit4Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(JUnit4Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(JUnit4Vectors.equal(new int[]{0,0}, new int[]{0,0}));
        assertTrue(JUnit4Vectors.equal(new int[]{0,0,0}, new int[]{0,0,0}));
        assertTrue(JUnit4Vectors.equal(new int[]{1,2,3}, new int[]{1,2,3}));
        
        assertFalse(JUnit4Vectors.equal(new int[]{}, new int[]{1}));
        assertFalse(JUnit4Vectors.equal(new int[]{0}, new int[]{1}));
        assertFalse(JUnit4Vectors.equal(new int[]{0,2}, new int[]{1,3}));
        assertFalse(JUnit4Vectors.equal(new int[]{1,2,3}, new int[]{4,5,6}));
        
        
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
   public void testScalarMultiplication() {
        System.out.println("*VectorsJUnitTest:testScalarMultiplication");
        assertEquals(0, JUnit4Vectors.scalarMultiplication(new int[]{0,0}, new int[]{0,0}));
        assertEquals(2, JUnit4Vectors.scalarMultiplication(new int[]{1,1}, new int[]{1,1}));
        assertEquals(-2, JUnit4Vectors.scalarMultiplication(new int[]{1,-1}, new int[]{-1,1}));
        assertEquals(0, JUnit4Vectors.scalarMultiplication(new int[]{5,-4}, new int[]{4,5}));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
    }
    
}
