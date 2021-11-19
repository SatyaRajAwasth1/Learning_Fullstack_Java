import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x+"\n \t this time the value "+x +" is random value");
        // for the random number in double , float, boolean , char we need to specify the specific data type instead of int
        // for number in specific range we have to specify the range like  int x = random.nextInt(6);
        // int x = random.nextInt(6); will print a random number from 0 to 5
        //for printing 6 we can do either int x = random.nextInt(7); or int x = random.nextInt(6)+1;
    }
    }

