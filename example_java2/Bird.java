/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_java2;

/**
 *
 * @author HP Gaming
 */
public class Bird extends Animal {
    private double flyingSpeed; 
    public Bird(String name, int age, double flyingSpeed){
        super(name, age);
        this.flyingSpeed=flyingSpeed; 
    }
    public double getFlyingSpeed(){
        return flyingSpeed;
    }
}
