
package oops;

//Parent class
class Ruman {
 String type = "Animal";

 Ruman() {
     System.out.println("Animal constructor called.");
 }

 public void sound() {
     System.out.println("Animals make sounds.");
 }
}

//Child class
class malik extends Ruman {
 String type = "Dog";

 malik() {
     super(); // Calls the parent class constructor
     System.out.println("Dog constructor called.");
 }

 public void printType() {
     System.out.println("Type in Dog: " + this.type);   // Refers to Dog's type
     System.out.println("Type in Animal: " + super.type); // Refers to Animal's type
 }

 @Override
 public void sound() {
     super.sound(); // Calls the parent class's sound method
     System.out.println("Dogs bark."); // Adds more functionality
 }
}

public class ThisnSuper {
 public static void main(String[] args) {
     malik m = new malik(); // Calls constructors
     m.printType();     // Demonstrates this and super for variables
     m.sound();         // Demonstrates super for methods
 }
}
