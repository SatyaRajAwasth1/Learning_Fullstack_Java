import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args) {
        //loop under / inside another loop
        //we have used nested or ladder statements already lets have a look on loops
        // as nested it means like the layer inside layer in the nest of bird

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter no. of rows <only integer>:");
        rows = scanner.nextInt();
        System.out.println("Enter no. of columns");
        columns = scanner.nextInt();
        System.out.println("Enter symbol that you wish to use:");
        symbol = scanner.next();
        //lets use loop
        for (int i=1; i<=rows; i++){
            System.out.println();
            for (int j=1; j<=columns; j++){
                System.out.print(symbol);
            }

        }

    }
}
