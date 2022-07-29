// Program to demonstrate character stream classes
// A java code to Create a new file and write some content
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
class FileReaderDemo{

	public static void main(String[] args){
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try{
		
				
			fr = new FileReader("newfile.txt");
			
			
			br = new BufferedReader(fr);
			
			
			String line;
			
			
			StringBuffer sb = new StringBuffer();
			
	  
			while( (line = br.readLine()) != null){ // null indicates EOF 
			  
			  System.out.println(line);
			  sb.append(line+"\n");
			  
		    }
				

			System.out.println("Content in SB is "+sb);
			
			
			
			
		}
		catch(FileNotFoundException e){
		
			System.out.println(e);	
		}
		catch(IOException e){
			System.out.println(e);	
		}
		finally{
			
			
			try{
				fr.close();
				br.close();
			}
			catch(IOException e){
				System.out.println(e);
			}
				
		}
		  
		
	}


}


