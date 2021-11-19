package java_oop.file_class;

import java.io.File;

public class FileClass_Basic {
    public static void main(String[] args) {
        /*
         # FILE--->
           - An abstract representation of file and directory pathname
         */

        File file = new File("C:\\Users\\Acer\\Desktop\\img\\dad.png");
        // we can also create new file by assigning the name and location as above and use createNewFile() method following the object

        if (file.exists()){
            System.out.println(" the file exists : ");
            System.out.println(file.getPath()); // getPath will show the path only if the file in project directory it will show name only
            System.out.println("absolute path is"+file.getAbsolutePath());
            System.out.println(" this is really a  file : "+file.isFile()); //isFile will check whether this is file or not
            // file.delete(); this will delete the file
        }
        else {
            System.out.println("file doesn't exist");
        }

    }
}
