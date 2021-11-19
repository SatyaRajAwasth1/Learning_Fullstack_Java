import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {
        // for-each ---> enhanced for loop a traversing technique to iterate through the elements in an array/collection
        // less steps and more readable than standard for
        // less flexible
        String[] pets = {"cat", "dog","parrot" };
        for (String i : pets){ // java for each loop
            //The syntax of Java for-each loop consists of data_type with the variable followed by a colon (:), then array or collection.
            System.out.println(i);
        }
        // as java for each is used for collection or arraylist
        //lets try it
        ArrayList<String> it_Courses = new ArrayList<String>();
        it_Courses.add("1. Engineering");
        it_Courses.add("2. BCA");
        it_Courses.add("3. CSIT");
        it_Courses.add("4. BIT");
        System.out.println("It courses in Nepal: ");
        for (String j : it_Courses) {
            System.out.println(j);
        }
    }
}
