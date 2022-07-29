import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ReadFile2{
	
	public static void main(String[] args){
		
	  try{	
	
	  FileInputStream is = new FileInputStream("file1.txt");
	   
	  // InputStreamReader is a bridge class which can help a character stream to communicate 
	  // Byte stream class
	  InputStreamReader isr = new InputStreamReader(is);
	  
	  
	  BufferedReader br = new BufferedReader(isr);
	  
	  
	  String line;
	  
	  while( (line = br.readLine()) != null){ // null indicates EOF 
		  
		  System.out.println(line);
	  }
	   	   
	  }
	  catch(FileNotFoundException e){
		
		System.out.println(e);	
	  }
	  catch(IOException e){
		System.out.println(e);	
	  }
	  
	   
	   
		
	
	}


}