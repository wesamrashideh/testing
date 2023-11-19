/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author HP Gaming
 */
public class Circle {
    public int rad; 
    public static final double PI=3.14; 
    public Circle(){} 
    public Circle(int rad){
        this.rad=rad; 
    }
    public Double GetRound(){
        return PI*rad;
    }
    public Double GetArea(){
        return PI*(rad*rad);
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    
    public int getRad() {
        return rad;
    }
    
}
