public class Method_Overriding_Main {
    // main class where main method resides
    public static void main(String[] args) {
        /*
        #MEHTOD OVERRIDING
          > declaring a method in subclass,
            - which is already present in parent class.
          > Done so that a child class can give its own implementation
         */
        Method_Overriding_Animal speak = new Method_Overriding_Animal();
        speak.sounds(); // being a object of class animal it will result the println of animal class
        // if we didn't override the method this will print from the instances where method is created
        // like now it will print of class animal which is parent class

        // to print the statement or line of subclass we need  create object of subclass and call or invoke the method
        Method_Overriding_Dog dog = new Method_Overriding_Dog();
        dog.sounds(); // will print "The dog barks", wala text..."

    }

}
