class conditions{

public static void main(String[] args){

     int a = 200; // declaration and initialization
     int b = 200;

      int c; // declaration only
          c = 30;

	/*
      if (a > b){

	System.out.println("a is max");
     }
	else if(b > a){

	System.out.println("b is max");
     }
     */

       if (a > b & a > c){
              System.out.println("a is max");
          }

	else if(b > a & b > c){

	System.out.println("b is max");
          }
	else if(c > a & c > b){

        System.out.println("c is max");
       }
      else{
         System.out.println("Invalid");
      }

}







}