import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        //          && = Read as AND: both conditions must be true
        //          || = Read as OR: Either condition must be true
        //          !  = Read as NOT: Reverses the condition true to false, false to true

        int temp = 25;
        if (temp>30) {
            System.out.println("Its host");
        }
        else if (temp>=20 && temp<=30){
            System.out.println("its about warm condition");
        }
        else {
            System.out.println("its cold ...");
        }
        // above we got about AND operator....now lets talk about the OR operator

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are under typing condition, To stop typing press Exit or Stop ");
        String response  = scanner.next();
        if (response.equals("Stop") || response.equals("Exit")) {
            System.out.println("Now you cant enter any text here");
        }
        else if (response.startsWith("s") || response.startsWith("e")) { // checks first letter e or s and response following as below
            System.out.println("Sorry you cant exit by entering "+response +" First letter must be capital");
        }
        else if (response != "Stop" || response != "Exit") {
            System.out.println("you have entered " +response);
        }
        else {
            System.out.println("sorry it haven't quited as u didn't enter Stop or Exit");
        }

    }
}
