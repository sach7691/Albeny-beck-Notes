import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

//Read a new file 

public class ByteStreamReadFile1{

    public static void main(String[] args){

  
    
  try{

    FileInputStream fi = new FileInputStream("file1.txt");

    InputStreamReader isr = new InputStreamReader(fi);

    BufferedReader br = new BufferedReader(isr);
     

    String line;

    while((line = br.readLine()) != null){ //-1 indicates EOF

    System.out.print(line);

    }
    
    br.close();
    fi.close();
    
  }

 catch(FileNotFoundException fn){

    System.out.println(fn);
  }
  catch(IOException io){

    System.out.println(io);
  }


 }


}