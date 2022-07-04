import java.util.Scanner;

public class If_Statement {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition evaluates to be true
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println(name + " G "+"Enter your age:");
        int age = scanner.nextInt();
        //****************************************************************************//
        if (age <= 18){
            System.out.println("Sorry " +name +" vae तिमि अझै बच्चा छाै दाई भन्ने गर ल");
        }
        else {
            System.out.println("ठिक छ राजा जेहोस, comment मा नभएनि message मा चाहि तिमि भन्न सक्छाै");
        }


    }
}
