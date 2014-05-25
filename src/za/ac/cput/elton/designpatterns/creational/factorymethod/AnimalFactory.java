/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.elton.designpatterns.creational.factorymethod;

/**
 *
 * @author 101Lenboxs
 */
public class AnimalFactory {
    public Animal getAnimal(String type){
        if("canine".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }
    }
}
