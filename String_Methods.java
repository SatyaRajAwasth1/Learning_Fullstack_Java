public class String_Methods {
    public static void main(String[] args) {
        //String ----> a reference data type that can store one or more characters
        //we know reference data type have access to useful methods
        String name = "smart";
        boolean result = name.equalsIgnoreCase("Smart");
//The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
        System.out.println(result);
        // similarly .length(); method gives the lenght of the string or total number of letters on a string with whitespaces
        System.out.println("number of letters on your name with spaces equals to: "+name.length());

        char char_At = name.charAt(0); //prints the character at 0 or first position
        System.out.println(char_At);

        int letter = name.indexOf("r"); // if i dont use "" it will take the parameter as string and show error
        System.out.println("letter r is at "+letter+"th position");
        //will out the index of r mean position of r from 0 position

        // similarly .isEmpty() will check whether the specification is empty or not

        // .toUpperCase will change the whole string to uppercase and toLowerCase will change to lower case

        // .trim() will cut the spaces

        // replace('a' 'o') will replace by o where there is a everywhere

    }
}
