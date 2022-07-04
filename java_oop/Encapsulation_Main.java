package java_oop;

public class Encapsulation_Main {
/*
   # Encapsulation--->
      - attributes of class will be hidden or private
      - Can be accessed only through methods (Getters and Setters)
      - You should make attributes private if ypu don't have a reason to make them public/protected
 */
    public static void main(String[] args) {

        Encapsulation_Car car = new Encapsulation_Car("Brave Nepalese","Mustang",2016 );
        car.setYear(2020);
        System.out.println(car.getMadeBy()+" had made the car " +car.getModel()+" model "+" in "+car.getYear());
    }
}
