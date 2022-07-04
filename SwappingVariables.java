public class SwappingVariables {
    public static void main(String[] args) {
        //main method started here String args will store all as array
        String glass1 = "water";
        String glass2 = "sugar";

        System.out.println("glass1 contains:" +glass1);
        System.out.println("glass2 contains:" +glass2);
        //let sugar glass is larger than water glass
        // i need to add more water in that glass which is not possible
        // so to add i want to change the glass with sugar glass
        // now to make water in glass of sugar and to put sugar in glass having water
        // i need third glass so am adding a variable temp_Glass
        String temp_Glass = glass1; //now glass1 or water glass is free so am pouring sugar on it
        glass1 = glass2;
        glass2 = temp_Glass; //this is variable swapping
        System.out.println("\n");
        System.out.println("\t after swapping 😋");
        System.out.println("now: \n glass1 contains: " +glass1 + "\n glass2 contains: " +glass2);



    }
}
