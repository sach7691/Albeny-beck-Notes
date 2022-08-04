class Outer{
		
	private int x = 1000;
	
	
	public int getX(){
		
		return x;
		
	}

		
	public class Inner{ // Non-Static inner class
		

		public Inner(){ // Inner class constructor
				
				System.out.println(x);
		}
			
	} // End of inner class
	
	
	public static class StaticInner{
		
		
		public StaticInner(){ // Static Inner class constructor
				
				//System.out.println(x); // Error, x is non-static in Outer class
				
			System.out.println(new Outer().x); // Output: 1000
				
		}
		
		
	}
	
	
	
	public void createLocalInnerClass(){
		
		
		// Local Inner class
		
		class LocalInner{


		}		
		
	}
	
	
	
	
	
}

class InnerClassesDemo{
	
	public static void main(String[] args){  
		
	// To create an object from a non-static inner class first 
		// we need to create from outer class
	
	Outer out = new Outer();
	
	
	Outer.Inner in = out.new Inner();
	
	
	// Create an object from Static Inner class
	
	// In this case there is no need to outer class object because we are create an instance from static inner class
	Outer.StaticInner staticIn = new Outer.StaticInner();
	
	
	
	
	}
}


