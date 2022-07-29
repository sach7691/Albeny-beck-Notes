class EmailException extends Exception{

	private String message;
	
	
	public EmailException(String message){
	
		this.message = message;
	}
	

	@Override
	public String toString(){
	
		return "Error Message is "+this.message;
	}


}
class UDException{
	
	public static void main(String[] args){
	
	    try{
			
		String email = args[0];
				
		/*
		
		  int indexOf(char ch)	
		
		*/
		
		if(email.indexOf('@') == -1){
			
		  EmailException myException = new EmailException("Invalid Email");
		  
		  throw myException;
			
		}
		
		}
		catch(EmailException e){
			
			System.out.println(e);
		}
	
	
	}
	

	

}