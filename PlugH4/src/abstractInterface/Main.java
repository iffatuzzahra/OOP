/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractInterface;

/**
 *
 * @author Lab Informatika
 */
public class Main {
     public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy ");
        Animal a = new Fish();
        Animal e = new Spider();
        //Pet p = new Cat();
        
        f.play();
        c.play();
        e.eat();
        e.walk();
        a.walk();
        a.eat();
    }
    
}
