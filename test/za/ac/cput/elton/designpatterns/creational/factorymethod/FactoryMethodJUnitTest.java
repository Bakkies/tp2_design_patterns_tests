/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.factorymethod;

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
public class FactoryMethodJUnitTest {
    AnimalFactory animalFactory;
    public FactoryMethodJUnitTest() {
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
    public void testFactoryMethodCat(){
        animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("feline");
        Assert.assertEquals(animal1.makeSound(), "Meow");
    }
    
    @Test
    public void testFactoryMethodDog(){
        animalFactory = new AnimalFactory();
        Animal animal2 = animalFactory.getAnimal("canine");
        Assert.assertEquals(animal2.makeSound(), "Woof");
    }
}