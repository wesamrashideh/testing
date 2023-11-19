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
public class Animal {
    private String name;
    private int age; 
    public Animal(String name, int age){
       this.name=name;
       this.age=age; 
    }
    public String getName(){
        return name; 
    }
    public int getAge(){
        return age; 
    }
}
