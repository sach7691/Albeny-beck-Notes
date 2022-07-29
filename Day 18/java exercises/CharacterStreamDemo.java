import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//create a new file and write some content

public class CharacterStreamDemo{

    public static void main(String[] args){
     
        FileWriter fw = null;

  try{

    fw = new FileWriter("file1.txt");
    fw.write("Welcome to class");

    fw.flush(); //this is the way to dispatch the everything

    System.out.println("File has been created successfully!!");

    
  }

 catch(FileNotFoundException fn){

    System.out.println(fn);
  }
  catch(IOException io){

    System.out.println(io);
  }

  finally{
   
     try{

        fw.close();
     }
     catch(IOException io){

        System.out.println(io);
      }

  }



 }


}