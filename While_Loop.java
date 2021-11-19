import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        // while loop ------> executes a block of code as long as its condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            if (name.isEmpty()) {
                System.out.println("Sorry you havent entered your name");
            }
            System.out.println("Enter your name");

            name = scanner.nextLine();

        }
        System.out.println("Welcome "+name);

    }

}

