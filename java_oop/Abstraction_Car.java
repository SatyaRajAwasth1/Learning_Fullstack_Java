package java_oop;

public class Abstraction_Car extends Abstraction_Vehicle {
    @Override
    void go() { // go method of parent class is implemented and overridden
        // abstraction helps to increase security issues
        System.out.println("The car is moving along the road it is in motion..^_^");
    }
}
