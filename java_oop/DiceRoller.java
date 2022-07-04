package java_oop;

import java.util.Random;

// instance class for the Variable_Scope.java
public class DiceRoller {
    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }
    void roll(Random random, int number){ // instead of passing parameter we can create a global variable or variable random outside the  method
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
