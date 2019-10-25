/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavapets;

import java.util.ArrayList;

/**
 *
 * @author alexb
 */
public class IntJavaPets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pet frank = new Pet("Frank", "Bird", 2);
        frank.makeSound();
        
        Dog boswer = new Dog("Bowser", "French Bulldog", 4, false);
        boswer.makeSound();
        boswer.setType("Bull Mastiff");
        System.out.println("My dog's name is " + boswer.getType());
        boswer.playTugOfWar();
        
        ArrayList<Pet> zoo = new ArrayList();
        zoo.add(new Dog("Gus", "Bernieses Mountain Dog", 4, true));
        zoo.add(new Cow("Buttercup", "American Jersey", 4));
        
        for(Pet pet:zoo){
            pet.makeSound();
        }
        
        Dog myNewDog = new FrenchBulldog("March", "Mutt", 4, false);
        
        if (myNewDog instanceof FrenchBulldog){
            FrenchBulldog temp = (FrenchBulldog)myNewDog;
            temp.eatFood();
            ((FrenchBulldog)myNewDog).eatFood();
        }
        
    }
}
