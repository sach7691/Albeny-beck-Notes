import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//Read a new file 

public class ReadFile1{

    public static void main(String[] args)throws IOException{

  
    FileWriter fw = new FileWriter("file2.txt");
    fw.write("Welcome to class");

    fw.flush(); //this is the way to dispatch the everything

    System.out.println("File has been created successfully!!");

    fw.close();


 }


}