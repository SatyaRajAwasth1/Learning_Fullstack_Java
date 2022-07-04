public class Array_2D {
    public static void main(String[] args) {
        // 2D array mean an array of arrays think it like parking of cars in a square arch of 3 rows and 2 columns or some extra
    //simply think it is a multi dimensional array that means having many dimensions @ D mean 2 dimension that is 2 dimensional array
        String[][] cars = new String[3][3];
        cars [0][0] = "Mustang";
        cars [0][1] = "Tesla";
        cars [0][2] = "Lambo";
        cars [1][0] = "Tata";
        cars [1][1] = "Honda";
        cars [1][2] = "Camaro";
        cars [2][0] = "Silverete";
        cars [2][1] = "Roila";
        cars [2][2] = "Baby Lion";

        for (int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j< cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            // we can write the above array like following additional way...
            /*
            * String[][] cars = {
                    {"camaro","corvette","Silverado"},
                    {"Mustang","Ranger", "F-150"},
                    {"Ferari","Lambo","Tesla"}
            };
            * */

        }
    }
}
