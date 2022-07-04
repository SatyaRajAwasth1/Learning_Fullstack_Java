package accessspecifier2;
import accessspecifier1.*;
public class C {
    String defaultMessage = "This is  message of default specifier";
    // if we don't imply any of specifier by default its protected
    // Protected instances can be instantiated under same class, its derived class and class under the same package only
public String publicMessage = "This is  a public message and can be used anywhere.";
}
