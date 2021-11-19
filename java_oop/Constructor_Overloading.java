package java_oop;

public class Constructor_Overloading {
    public String sub1;
    protected int subjects;
    String sub2;
    String sub3;
    String sub4;


    /*
        Overloaded constructors.....>
        - multiple constructors within a class with the same name,
        - but have different parameters
        - name+parameters = signature as like on the method overloading
         */
   Constructor_Overloading(int subjects){
       this.subjects = subjects;

   }
    Constructor_Overloading(int subjects, String sub1){
        this.sub1 = sub1;
        this.subjects = subjects;
    }
    Constructor_Overloading(int subjects, String sub1, String sub2){
        this.sub1 = sub1;
        this.subjects = subjects;
        this.sub2 = sub2;
    }
    Constructor_Overloading(int subjects, String sub1, String sub2, String sub3){
        this.sub1 = sub1;
        this.subjects = subjects;
        this.sub3 = sub3;
    }
    Constructor_Overloading(int subjects, String sub1, String sub2, String sub3, String sub4){
        this.sub1 = sub1;
        this.subjects = subjects;
        this.sub1 = sub2;
        this.sub1 = sub3;
        this.sub1 = sub4;
    }
}
