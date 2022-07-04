package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        /*
        # EXCEPTION-->
           - An event that occurs during the execution of a program
             that, disrupts the normal flow of instructions.
         */
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter any whole number that you want divide: ");
            double x = scanner.nextDouble();

            System.out.println("Enter the number that you wish to divide by:");
            double y = scanner.nextDouble();

            float z = (float) (x/y);
            System.out.println("the result is "+z);
        }
        catch (ArithmeticException e){
            System.out.println("sorry you cant divide any number by 0. It does not exist.");
        }
        catch (InputMismatchException e){
            System.out.println(" Sorry! you can enter numbers only..");
        }
        catch (Exception e){
            System.out.println("something got wrong..");
        }
        finally {
            scanner.close();
        }
    }
}
