public class Methods {
    // function are called methods in java
    // that is a block of code that is executed whenever it is called upon

    static void firstMethod () {
        //first letter of the must be lowercase and then camelcase
        // and care that method should be created outside main method
        System.out.println("hi"+ "hope you are doing well");
    }
    //now to display the thing inside the function it must be called outside it
    // calling method also known as invoking
    static void methodWithParameter(String name){ //as method is void it cant be returned
        // Return will return or set the value for this use return keyword and that we want to return that is variable oe something
        // for that we have tp use return data type mean except void
        System.out.println("Yes you are: "+name);
    }
    public static void main(String[] args) {
        // to invoke a method inside main function method must be static type
        //Or we can call by creating a object
        firstMethod(); // we just call method using its name because we used static type above
        firstMethod();
        firstMethod(); // Once created method can be invoked n times
   /* we can pass parameter through methods
   - Argument: value passing through the methods
   - Parameter: a named variable passed into a function/method
    */

        methodWithParameter("Satya"); //Argument passing on a parameter name
    }
//lets create method without static  and call it using object
    //object will be discussed while learning object
}
