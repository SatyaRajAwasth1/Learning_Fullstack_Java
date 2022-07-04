package java_oop;

public class ArrayOfObjects_Main {
    public static void main(String[] args) {
      /*  int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
       */ // manual way to use arrays

        ArrayOfObjects food1 = new ArrayOfObjects("pizza");
        ArrayOfObjects food2 = new ArrayOfObjects("Donut");
        ArrayOfObjects food3 = new ArrayOfObjects("Burger");
// created three objects food1, food2 and food3 respectively from the class ArrayOfObjects.java

        // now create a array of objects
       /*
       ArrayOfObjects[] refrigerator = new ArrayOfObjects[3];

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        */

        // instead of doing this long code we will create array from another way but can be done from any of ..
        ArrayOfObjects[] refrigerator = {food1, food2, food3};

        // Lets print the array of objects
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        // if we only specify the index of array and dont use .name only the place of the objects will be printed


    }
}
