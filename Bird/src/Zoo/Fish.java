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
public class Fish {
    private String name; 
    private String scaleColor; 
    public Fish(String name, String scaleColor){
        this.name=name;
        this.scaleColor=scaleColor; 
    }
    public void swim(){
        System.out.println("fish swimming");
    }
}
