class exercise{

public static void main(String[] args){

//Part 1 to Part 5

       String name = "Sachini";
       int age = 30;

	System.out.println("My Name is : " + name);
      System.out.println("My Age is : " + age);

//Part 6

       double y;
       double m = 1;
       double x = 0.5;
       double c = 15;

       y = m * x + c;
   
       System.out.println("Equation is : y = m * x + c");
       System.out.println("Value of y is : " + y);

//Part 7 to Part 8

        boolean isRaining = true;
        boolean happy = false;
      
        if (isRaining & !happy){
      
        System.out.println("It is raining and we're happy");
        }
        else if (isRaining & happy){
      
        System.out.println("It is raining and we're not happy");
        }
        else if (!isRaining & happy){
      
        System.out.println("It is not raining and we're happy");
        }
        else if (!isRaining & !happy){
      
        System.out.println("It is not raining and we're not happy");
        }

//Part 9
      
        if (isRaining | !happy){
      
        System.out.println("It is raining and we're happy");
        }
        else if (isRaining | happy){
      
        System.out.println("It is raining and we're not happy");
        }
        else if (!isRaining | happy){
      
        System.out.println("It is not raining and we're happy");
        }
        else if (!isRaining | !happy){
      
        System.out.println("It is not raining and we're not happy");
        }




}


}
