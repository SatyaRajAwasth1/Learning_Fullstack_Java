import java.util.*; // all classes of util library imported * defines all classes
public class ArrayList_2D {
    //2D ArrayList --> can be told as dynamic list of lists
    // we can easily change the list and size of items during run time
    public static void main(String[] args) {
        ArrayList<String> serviceList = new ArrayList(); //created a arraylist for my service
        serviceList.add("Web Development");
        serviceList.add("app Development");
        serviceList.add("Advertising");
        // let's create another arraylist for my skills
        ArrayList<String> skillList = new ArrayList();
        skillList.add("java");
        skillList.add("PHP");
        skillList.add("javascript");

        // 2 arraylist created, lets merge both of the lists on a new list that will show  full features
        ArrayList<ArrayList<String>> allFeatures = new ArrayList();
        allFeatures.add(serviceList);
        allFeatures.add(skillList);
        System.out.println(allFeatures); //this will show all features merged together

        //add user input into array list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter my another skill: ");
        String skill = scanner.nextLine(); //taking user input
        skillList.add(skill);//user input added to skill list

        System.out.println("thanks plz Enter \n 1. show all features to see all features" +
                "\n 2. show skills to see my skills" +
                "\n 3. show services to see my services" );
        // generating conditions for user input response
        String user_Input = scanner.nextLine();

        if (user_Input.equals("show all features")){
            System.out.println("My all features: "+allFeatures);
        }
        else if (user_Input.equals("show skills")){
            System.out.println("My skills: "+skillList);
        }
        else if (user_Input.equals("show services")){
            System.out.println("services that i can provide: "+serviceList);
        }
        else {
            System.out.println("your input doesn't match please Enter \n i. show all features to see all features" +
                    "\n 2. show skills to see my skills " +
                    "\n 3. show services to see my services");
        }
        // get(index number ) will result the number and other string methods give same result as previously we learnt in String_Methods.java


    }
}
