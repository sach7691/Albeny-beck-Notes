class AnonymousInnerClass{


  	public static void main(String[] args){  
	
		 
	  // Create objects from fully implemented classes/concrete classes
	  
	  
	  //Storage st = new Storage();// Error, interface cannot be instantiated
	  
	  
	  FileStorage fs = new FileStorage();
	  
	  fs.store();
	  
	  
	  Storage st1 = new Storage(){
		  
		  
		  public void store(){
   
				System.out.println("Storing something is a file system V2");
	
		  }
		
	  };
	
	
	
	  Storage st2 = new Storage(){
		  
		  public void store(){
   
				System.out.println("Storing something is a file system V3");
	
		  }
		
		
	  };
	  
	  
	  st1.store();
	  
	  
	  st2.store();
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	}
	
	

}