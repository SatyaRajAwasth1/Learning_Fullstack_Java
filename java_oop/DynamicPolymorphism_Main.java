package java_oop;

import java.util.Scanner;

public class DynamicPolymorphism_Main {
    /*
    # Polymorphism--> many shapes / forms
      Dynamic--> After compilation (During runtime)
       > lets see an example
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DynamicPolymorphism_Animal animal;
        System.out.println("What do you prefer.. \n \t 1 = dog \n \t 2 = cat");

        int input = scanner.nextInt();

        if (input == 1){
            animal = new DynamicPolymorphism_Dog();
            animal.speaks();
        }
        else if (input == 2){
            animal = new DynamicPolymorphism_Cat();
            animal.speaks();
        }
        else {
            animal = new DynamicPolymorphism_Animal();
            animal.speaks();
        }
    }



}
