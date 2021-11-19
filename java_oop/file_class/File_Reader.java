package java_oop.file_class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args)  {
        /*
          #FILE READER--->
            > Read the contents of a file as a stream of characters. One by one
            > read() returns an int value which contains the byte value
            > when read() returns -1, there is no more data to be read
         */
        try {
            FileReader reader = new FileReader("java_read_file.txt");
            int data = reader.read();
            while (data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("something gone wrong");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }

    }
}
