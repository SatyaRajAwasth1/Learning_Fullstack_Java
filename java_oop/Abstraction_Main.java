package java_oop;

public class Abstraction_Main {
    /* abstract--->
       > abstract classes cannot be instantiated, but they can have a subclass
       > Abstract methods are declared without an implementation
     */
    public static void main(String[] args) {
      // Abstraction_Vehicle vehicle = new Abstraction_Vehicle(); this will show error because class vehicle is abstract

        Abstraction_Car car = new Abstraction_Car(); // object created of child class car to call the method under main
        car.go(); // this will print the line written in go() method in child class


    }
}
