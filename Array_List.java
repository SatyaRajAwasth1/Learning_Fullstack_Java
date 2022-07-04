import java.util.ArrayList; //ArrayList class imported from util java library to use Arraylist

public class Array_List {
    // ArrayList ----> a resizable array
    // Elements can be added and removed after compilation phase
    // store reference data types
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        //way of listing array to create a list of int type we should replace String by Integer and that we need for each type of data types
        food.add("khir"); //add() method adds element to the array by crating variable that takes user input and follow it by .add() method user input can be also added to array list
        food.add("dar");
        food.add("dhido");

        for (int i=0; i< food.size(); i++){
            System.out.println(food.get(i));
        }

        // similarly .set(index number, element of assigned type) we can replace value of specified index
        //remove(index number) will remove the index number from array list
        // .clear() will clear the total list which we can use while we have to clear everything from the list in real life
    }
}
