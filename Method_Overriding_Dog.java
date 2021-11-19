public class Method_Overriding_Dog extends Method_Overriding_Animal{
    // subclass dog of  super class animal


    @Override   // we need to annotate this with @override to overrie methods.
    // while we select the method it will automatically come but on some IDE's we need to assign
    void sounds() {
        System.out.println("The dog barks...📢📣");
    }
}
