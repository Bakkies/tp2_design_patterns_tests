/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.singleton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 101Lenboxs
 */
public class SingletonJUnitTest {
    SingletonExample singletonExample;
    public SingletonJUnitTest() {
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
    public void testSingleton()
    {
        singletonExample = SingletonExample.getInstance();
        Assert.assertEquals(singletonExample.sayHello(), "Hello");
    }
}