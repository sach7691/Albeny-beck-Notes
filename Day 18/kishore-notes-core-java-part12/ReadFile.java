import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class ReadFile{
	
	public static void main(String[] args){
		
	  try{	
	
	  FileInputStream is = new FileInputStream("file1.txt");
	   
	  int i; 
	   
	  while( (i = is.read()) != -1){ // -1 indicates EOF 
		  
		  System.out.print((char)i);
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