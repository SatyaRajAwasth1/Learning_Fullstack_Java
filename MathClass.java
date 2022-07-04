import java.util.Scanner;
import java.util.Scanner.*;

public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create two variables
        double a = 2.71 ;
        double b = -13 ;
        double c = Math.max(a, b);  //store max value in variable c

        System.out.println("Greater value among " + a +" and " +b + " is "+c);

        // now check the user inputed number for maximum value

        System.out.println("Enter first number"); // will say user to input
        double x = scanner.nextDouble();
        // for second number
        System.out.println("Enter another number you wish to compare with " +x);
        double y = scanner.nextDouble();
        // compare and store the value in another variable
        double max = Math.max(x, y);
        System.out.println("Larger number among " +x +" and " +y + " is " +max);

        // similarly, we can use other math methods to use by using Math.method() we want ..
        // for eg. Math.abs(b) will give absolute or positive value of b
        //Math.min() for minimum
        //Math.sin() for value of sign etc.
        // Math.sqrt(int y=10) will give square root of 10
        // Math.round(2.71) will out the value of 2.71 to 3

    }
}
