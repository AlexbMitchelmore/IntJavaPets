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
public class FrenchBulldog extends Dog{
    
    public FrenchBulldog(String name, String type, int numOfLegs, boolean hasCollar) {
        super(name, type, numOfLegs, hasCollar);
    }
    
    public void eatFood(){
        super.p("I am eating... nom nom nom");
    }
    
    
}
