public class To_StringMethod {
    // toStrinng() --> special method that all objects inherit
    // that returns a string that "textually represents" an object.
    // can be used both implictly and explictly

    int rollno;
    String name;
    String city;

    To_StringMethod(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method
        return rollno+" "+name+" "+city;
    }
    public static void main(String args[]){
        To_StringMethod s1=new  To_StringMethod(101,"Raj","lucknow");
        To_StringMethod s2=new  To_StringMethod(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}

