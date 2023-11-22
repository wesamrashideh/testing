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
public class Shark extends Fish {
    public Shark(String name, String scaleColor){
        super(name, scaleColor);
    }
     public void swim(){
        System.out.println("shark swimming in the deeo");
    }
}
