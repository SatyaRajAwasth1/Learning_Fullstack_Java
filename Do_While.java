import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        // Do while loop ------> first execute a statement then do same like while....executes a block of code as long as its condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            if (name.isEmpty()) {
                System.out.println("Sorry you haven't entered your name");
            }
            System.out.println("Enter your name");

            name = scanner.nextLine();
    }
        while (name.isBlank()) ;
            System.out.println("Welcome "+name +" Your name was checked under do while");
    }
}
