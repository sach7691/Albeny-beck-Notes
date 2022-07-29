// Program to demonstrate character stream classes
// A java code to Create a new file and write some content
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileWriterDemo{

	public static void main(String[] args){
		FileWriter fw = null;
		
		
		
		try{
		
				
			fw = new FileWriter("newfile.txt");
			
			fw.write("Welcome to Character Stream classes");
			
			//fw.flush();
			
			System.out.println("File created!");
		}
		catch(FileNotFoundException e){
		
			System.out.println(e);	
		}
		catch(IOException e){
			System.out.println(e);	
		}
		finally{
			
			
			try{
				fw.close();
			}
			catch(IOException e){
				System.out.println(e);
			}
				
		}
		  
		
	}


}


