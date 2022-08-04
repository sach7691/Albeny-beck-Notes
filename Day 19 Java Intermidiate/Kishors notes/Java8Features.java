class Java8Features{


  	public static void main(String[] args){  
	
		 
	   // Extract a lambda expression from the below code
	  
	 /* Storage st1 = () -> {	System.out.println("Storing something is a file system V2"); };
		
	
	
	  Storage st2 = () -> {	System.out.println("Storing something is a file system V3");};
		  
	  
	  st1.store();
	  
	  
	  st2.store();
	  
	  */
	  
	   
	  CalculatorService cs1 = (int a,int b) -> { return a + b; };
	  
	  
	  CalculatorService cs2 = (a,b) -> { return a + b; };
	  
	  
	  
	  CalculatorService cs3 = (a,b) -> a + b;
	  
	  
	  System.out.println(cs1.calc(10,20));
	  
	  System.out.println(cs2.calc(10,20));
	  
	  System.out.println(cs3.calc(10,20));
	  
	  
	  GreetingService gs = (name) -> System.out.println("Hello "+name);
	  
	
	  gs.sayHello("Kishore");
	  
	  
	}
	
	

}