/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced_person;

/**
 *
 * @author HP Gaming
 */
public class Javaadvanced_person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Person p=new Person();
    p.name="wesam";
    p.SayHello();
    Person p2=new Person();
    p2=p;
    p2.SayHello();
    Person p4=null;
    p4.name="wesss";
    p4.SayHello();
    }
    
}
