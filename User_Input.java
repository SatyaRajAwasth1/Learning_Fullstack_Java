import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        // for user input in java we need scanner class for that first import the package from java library
      Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " +name + " How old are you ? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food?.🤣");
        String food = scanner.nextLine();
        System.out.println("Ohh " + name+":" + "\n \t You are "+age +" years old.");
        System.out.println("your favourite food is" +food);

        // similarly, scanner.nextFloat() can be used for float
      // Scanner.nextBoolean() for boolean type etc. can be used to take specific type
    }
}
