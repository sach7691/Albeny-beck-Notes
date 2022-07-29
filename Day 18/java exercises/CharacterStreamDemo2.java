import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//create a new file and write some content

public class CharacterStreamDemo2{

    public static void main(String[] args)throws IOException{

  
    FileWriter fw = new FileWriter("file2.txt");
    fw.write("Welcome to class");

    fw.flush(); //this is the way to dispatch the everything

    System.out.println("File has been created successfully!!");

    fw.close();


 }


}