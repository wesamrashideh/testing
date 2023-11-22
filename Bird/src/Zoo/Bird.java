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
public class Bird {
private String name; 
private String color; 
public Bird(String name, String color){
    this.name=name;
    this.color=color;
}
public void fly(){
    System.out.println("bird flying");
}
}

