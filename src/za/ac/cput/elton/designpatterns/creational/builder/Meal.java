/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.builder;

/**
 *
 * @author 101Lenboxs
 */
public class Meal {
    private String drink;
    private String mainCourse;
    private String side;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    
    public String toString(){
        return "Drink: "+ drink+", Main Course: "+ mainCourse+", side: "+side;
    }
}
