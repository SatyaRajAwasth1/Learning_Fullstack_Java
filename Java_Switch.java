public class Java_Switch {
    public static void main(String[] args) {
        // switch =  statement that allows a variable to be tested for equality against a list of values

        String day = "Wednesday";
        switch (day){
            case "Sunday":
                System.out.println("it is Sunday!");
            break;
            case "Monday":
                System.out.println("it is Monday!");
            break;
            case "Tuesday":
                System.out.println("it is Tuesday!");
            break;
            case "Wednesday":
                System.out.println("it is Wednesday!");
             break;
            case "Thursday":
                System.out.println("it is Thursday!");
            break;
            case "Friday":
                System.out.println("it is Friday!");
            break;
            case "Saturday":
                System.out.println("!Its Saturday. a Holiday");
            break;
            default: {
                System.out.println("The day doesn't match with 7 days of a week");
            }
        }

    }
}
