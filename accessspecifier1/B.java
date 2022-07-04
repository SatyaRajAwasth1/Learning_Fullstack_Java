package accessspecifier1;
import accessspecifier2.*;
public class B {
    private String privateMessage = "this is a private message this instance can be used under this class only";
    public static void main(String[] args) {
       B msg = new B();
        System.out.println(msg.privateMessage);

        C pubMsg = new C();
        System.out.println(pubMsg.publicMessage);

        // protected of Amain can be used here coz both ot these are classes of same package
        Amain amain = new Amain();
        System.out.println(amain.protectedMsg);
    }

}
