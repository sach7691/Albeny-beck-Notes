import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

class DeSerializationDemo{
	
	
	public static void main(String[] args) throws ClassNotFoundException{
		
	   //Create FileInputStream object
	   
	   
	   try{
		   
		   FileInputStream is = new FileInputStream("emp_object.dat");
		   
		   
		   // Create an ObjectInputStream by connecting FileInputStream 
		   
		   
		   ObjectInputStream ois = new ObjectInputStream(is);
		   
		   // Read Object from a file / byte stream
		   
		   Employee e1 = (Employee) ois.readObject();
		   
		   System.out.println("Object has been DeSerialiazed");
		   
		   System.out.println(e1);
	   
	   
	   }
	   catch(FileNotFoundException e){
		   
		  System.out.println(e); 
	   }
	   catch(IOException e){
		   
		  System.out.println(e); 
	   }
	   
		
	}

}