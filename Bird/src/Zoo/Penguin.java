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
public class Penguin extends Bird {
    public Penguin(String name, String color){
        super(name,color);
    }
    public void fly(){
        System.out.println("penguin connot fly");
    }
}
