import java.util.Scanner;

public class Hypotenuse_Math {
    public static void main(String[] args) {
        double x;
        double y ;
        double z ;
       Scanner scanner = new Scanner(System.in) ;
        System.out.println(" Enter length of the one side: ");
        x = scanner.nextDouble();
        System.out.println("Enter the length of another side");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+ (y*y));
        System.out.println("the hypotenuse is : " +z);
        scanner.close();
    }
}
