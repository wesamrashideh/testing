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
public class Polymorphism {
    static void performActivity(Object animal) {
        if (animal instanceof Bird) {
            ((Bird) animal).fly();
        } else if (animal instanceof Fish) {
            ((Fish) animal).swim();
        }
    }
}
