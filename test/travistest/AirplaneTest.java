/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travistest;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author claudio
 */
public class AirplaneTest {

    public AirplaneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPeople method, of class Airplane.
     */
    @Test
    public void testGetPeople() {
        System.out.println("getPeople");
        Airplane instance = new Airplane(100);
        int expResult = 100;
        int result = instance.getPeople();
        assertEquals(expResult, result);

    }

    /**
     * Test of getName method, of class Airplane.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Airplane instance = new Airplane(0);
        String expResult = "Airbus";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

}
