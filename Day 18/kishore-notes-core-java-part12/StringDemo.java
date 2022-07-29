class StringDemo{
   
	public static void main(String[] args){  
  
		/*
       String s1 = "hello";
	   
	   s1.toUpperCase();
	     
	   System.out.println(s1); // hello
	   
	   */
	   
	   
	   /*
	   String s1 = "hello";
	   
	   s1 = s1.toUpperCase();
	     
	   System.out.println(s1); // HELLO
	   
	   
	   */


	   /* 	
	   String s1 = "hello";
	   
	   
	   String s2 = new String("hello");
	   
	   
	   System.out.println(s1 == s2);  // false
	   
	   */
	   
	   
	   String s1 = "hello"; // String Literal
	   
	   
	   String s2 = "hello" // String Literal
	   
	   /*
	     Object created using String literal is stored in String Pool for future 
		 use 
		 
		 If a string literal is repeated multiple times then programming system 
		 
		 searches for any existing string literal (in String Pool) that matches the new one and uses same object
	   
	   */
	   
	   
	   System.out.println(s1 == s2);  // true
	   
	 
       	 


	}

}