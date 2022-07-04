import java.util.Scanner;

public class Method_Overloading {
    public static void main(String[] args) {
        // overloading methods mean adding different parameters to a same name
        // method signature ----> method name + parameters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        double a = scanner.nextInt();
        System.out.println("Input another number");
        double b = scanner.nextDouble();
        System.out.println("enter another number again if u want");
        String c = scanner.next();
        multiply(a , b);
    }
    static  int multiply(double a , double b){
        System.out.println("product of " +a +" and " +b +" from overloaded function is");
        return (int) (a * b);
    }
    static  double multiply(double a , double b, int c){
        System.out.println("product of " +a +","+b+" and " +c +" from overloaded function is");
        return (int) (a * b * c);
    }
}
