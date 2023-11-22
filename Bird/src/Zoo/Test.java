/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author HP Gaming
 */
public class Test {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(" Eagle", "Brown");
        Penguin penguin = new Penguin(" Penguin", "White");
        Shark shark = new Shark("Shark", "blue");
        Goldfish goldfish = new Goldfish("Goldfish", "Orange");
        Polymorphism.performActivity(eagle);
        Polymorphism.performActivity(penguin);
        Polymorphism.performActivity(shark);
        Polymorphism.performActivity(goldfish);
        
    }
}
