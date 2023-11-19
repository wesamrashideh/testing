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
public class Example_java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 3, "Roarrrr!");
        System.out.println("Lion Information:");
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Roar: " + lion.getRoar());
        System.out.println();

        // Create an instance of Bird
        Bird bird = new Bird("Eagle", 5, 50);
        
        // Display information about the bird
        System.out.println("Bird Information:");
        System.out.println("Name: " + bird.getName());
        System.out.println("Age: " + bird.getAge());
        System.out.println("Flying Speed: " + bird.getFlyingSpeed() + " km/h");
    }
    
}
