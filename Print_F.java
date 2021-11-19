public class Print_F {
    public static void main(String[] args) {
        // printf() --> an optional method to control format and display text to the comseole window
        //  two arguments = format string + (object/ variable/ value)
        // % [flags] [precision] [width] [conversion-character]

        boolean printBool = true;
        char printChar = '#';
        String printString = "Satya";
        int printInt = 50;
        double printDouble = 19819;


        /*
        System.out.printf("%s", printString);
        System.out.printf("%i", printInt);
        System.out.printf("%b", printBool);
        System.out.printf("%c", printChar);
        System.out.printf("%d", printDouble);
         */

        //Width
        // minimum number of character
        System.out.printf("Hello %10s", printString); // value before s and after % will give the space width between the written text and value of variable
        // if we use -10 then it will reduce the space between them by assigned value only under the remaining space

        /*
        # [precision]
        - sets number of digits or precision when outputting floating-point values
         */
       // System.out.printf("\n You have this much money %.2f", printDouble);

        /*
        # [flags]
        > adds an effect to output based on the flag added to format specifier
        > - : left justify
        > + : output a plus (+) or minus (-) sign for a numeric value
        > 0 : numeric values are zero-padded
        > , : comma grouping separator if numbers greater than 1k
         */
        System.out.printf("\n eg of flags %,2f", printDouble);
    }
}
