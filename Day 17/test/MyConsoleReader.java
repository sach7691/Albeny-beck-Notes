import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuffer;


public class MyConsoleReader{

  public static void main(String[] args)throws IOException{

    //create a class object to invoke ReadAndPrint method 
    MyConsoleReader myConsole = new MyConsoleReader();
    myConsole.ReadAndPrint();
     
  }

  public void ReadAndPrint()throws IOException{

    //we have to create inputstreamreader first otherwise we don't have a parameter to pass in the bufferreader
   
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

     //BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //this also possible

    System.out.println("Enter a string : ");

    //Create a StringBuffer to create modifiable string objects
    StringBuffer sb = new StringBuffer();

     
    String str;
    //While loop checks the cmd-line stop to terminate the append
    while(!"stop".equals((str = br.readLine())) ){ 
     
     //append start
     System.out.println("Enter a string to Append: ");
     sb.append(" ");
     sb.append(str);

    }
    
    //Print the final output after appending
    System.out.println("Final Output String : "+ sb);

    //closing the resources
    isr.close();
    br.close();

  }

}