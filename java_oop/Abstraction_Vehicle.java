package java_oop;

public abstract class Abstraction_Vehicle {
   // now we cannot create instances of this class
    abstract void go(); // go method created
    // point to note here is abstract methods shouldn't have body
    // but these can be overridden from child or main class
    // abstract methods must be implemented on child class
}
