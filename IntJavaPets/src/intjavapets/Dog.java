/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavapets;

/**
 *
 * @author alexb
 */
public class Dog extends Pet{
    
    private boolean hasCollar;
    
    public Dog(String name, String type, int numOfLegs, boolean hasCollar) {
        super(name, type, numOfLegs);
        this.hasCollar = hasCollar;
    }
    
    public boolean isHasCollar(){
        return hasCollar;
    }
    
    public void setHasCollar(){
        
    }
    
    public void makeSound(){
        super.p("I bark");
    }
    
    public void playTugOfWar(){
        super.p("I am playing tug of war");
    }
    
    public void setType(String type){
        super.setType("Dog: " + type);
    }
    
}
