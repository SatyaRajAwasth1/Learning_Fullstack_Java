package accessspecifier2;
import accessspecifier1.*;
public class Asub extends Amain{
    public static void main(String[] args) {
        C obj1 = new C();
        System.out.println(obj1.defaultMessage ); // here this will run

        C pubMsg = new C();
        System.out.println(pubMsg.publicMessage);

        // protected instance of Amain cannot be used here coz it is class of another package
        /*
        Amain amain = new Amain();
        System.out.println(amain.protectedMsg);
        // this will cause error
         */
    }

}
