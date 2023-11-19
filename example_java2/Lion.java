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
public class Lion extends Animal{
    private String roar; 
    
    public Lion(String name, int age, String roar){
        super(name, age);
        this.roar = roar;
    }
    public String getRoar(){
        return roar; 
    }
}
