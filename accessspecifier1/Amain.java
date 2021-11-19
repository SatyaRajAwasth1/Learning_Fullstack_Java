package accessspecifier1;
// to use instances of classes from another package and instances from another package we have to import the package where instance lies
import accessspecifier2.*; // package accessspecifier2 is imported
// if we have to import only only class we have to use .class name instead of .* after the import package name
public class Amain {
    // here main class will reside
    protected String protectedMsg = "this protected can be used under same class, derived class and class under same package only.";
    public static void main(String[] args) {
       /*
       C obj1 = new C();
       System.out.println(obj1.defaultMessage ); // this results error becuase by default the specifier is protected
       - the above statement can be run only inside the Asub class that is child class of this Amain class but being under same package it can be instantiated form the Asub.java
       */
        C pubMsg = new C();
        System.out.println(pubMsg.publicMessage);

        Amain amain = new Amain();
        System.out.println(amain.protectedMsg);
    }
}
