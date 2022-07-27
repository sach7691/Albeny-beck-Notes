import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandleDemo1{

    public static void main(String[] args){
       

        try{
        //This creates a file in write mode
        //FileOutputStream fo = new FileOutputStream("File1.txt"); //takes a string as parameter
         
        //This creates a file in append mode
        //run code for 3 times you will see the content is appended 3 times
        FileOutputStream fo = new FileOutputStream("File1.txt",true); //takes a string as parameter
        //write somthing into file1.txt

       // fo.write("Welcome to file handling".getBytes()); //we can write foloowing way

       byte[] bytes = "Welcome to file handling".getBytes();
       fo.write(bytes);

        }

        catch(FileNotFoundException e){

            System.out.println(e);


        }

        catch(IOException i){

            System.out.println(i);


        }

    }


}