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
public class Pet {
    
    private String name;
    private String type;
    private int numOfLegs;
    
    
    public Pet(String name, String type, int numOfLegs){
        this.name = name;
        this.type = type;
        this.numOfLegs = numOfLegs;
    }
    
    
    public void makeSound(){
        p("I <blank>!: ");
    }
    
    public void p(String msg){
        System.out.println(msg);
    }
}
