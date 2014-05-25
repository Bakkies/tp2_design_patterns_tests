/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.builder;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 101Lenboxs
 */
public class BuilderPatternJUnitTest {
    
    MealBuilder mealBuilder;
    MealDirector mealDirector;
    Meal meal;
    public BuilderPatternJUnitTest() {
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
    public void testBuilderItalian(){
        mealBuilder = new ItalianMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        Assert.assertEquals(meal.getDrink(), "red wine");
        Assert.assertEquals(meal.getMainCourse(), "pizza");
        Assert.assertEquals(meal.getSide(), "bread");
    }
    
    @Test
    public void testBuilderJapanese(){
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        meal = mealDirector.getMeal();
        Assert.assertEquals(meal.getDrink(), "sake");
        Assert.assertEquals(meal.getMainCourse(), "chicken teriyaki");
        Assert.assertEquals(meal.getSide(), "miso soup");
    }
}