import java.util.Scanner;

public class Array {
    // Array -----> used to store multiple values simply a set of similar type of data
    public static void main(String[] args) {
        String[] mountains = {"Sagarmatha", "Kanchanjunga", "Saipal", "Jethi Bahurani"};
        System.out.println(mountains[3]);
        // we can use array on another way to lets took a look care that every inex or elements of array must be in sam edata type

        String[] provinces = new String[8];
        provinces[0]="";
        provinces[1] = "pradesh 1";
        provinces[2] = "pradesh 2";
        provinces[3] = "Bagmati pradesh";
        provinces[4] = "Gandaki pradesh";
        provinces[5] = "Lumbini pradesh";
        provinces[6] = "Karnali swarga ko ek bhag";
        provinces[7] = "Sudurpaschim sundar swargako tukra";
        // for printing all the elements of array or to use array we can also use for loop lets take one example that will print the names of all provinces above
        //System.out.print("Provinces of Nepal: ");
       /* for (int i = 0; i <= provinces.length; i++){
          *  System.out.println(provinces[i]);
        }
         */
     // now lets take user input number of province and return province name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of province you wish to know name");
        int p_Num = scanner.nextInt();
        if (p_Num == 0){
            System.out.println("Sorry, zero number province is never assigned; \n enter number between 1 to 7");
        }
        else if (p_Num==1){
            System.out.println("Province 1 havent named at it is known as "+provinces[1] +" now");
        }
        else if (p_Num==2){
            System.out.println("Province 2 havent also named at it is known as "+provinces[2] +" now");
        }
        else if (p_Num==3){
            System.out.println("Province 3 is "+provinces[3] +" Province where capital Kathmandu is situated");
        }
        else if (p_Num==4){
            System.out.println("Province 4 is "+provinces[4] +" Where pokhara , Manag , Mustang are situated");
        }
        else if (p_Num==5){
            System.out.println("Province 5 is "+provinces[5] +" Where Lumbini birthplace of Buddha is situated");
        }
        else if (p_Num==6){
            System.out.println("Province 4 is "+provinces[6] +" Where Humla Jumla are situated");
        }
        else if (p_Num==7){
            System.out.println("Province 7 is "+provinces[7] +" Most beautiful part of world Khaptad, Saipal, Api lies");
        }
        else {
            System.out.println("your input doesnt match list of provinces of nepal enter only from 1 to 7");

        }
    }
}
