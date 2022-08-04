class Outer{

   static int x = 10;

     class Inner{

        int y = 20;

        public Inner(){
        
          System.out.println(x);

        }

    }


}


 class InnerDemo1{


    public static void main(String[] args){


            Outer outer = new Outer();

            Outer.Inner  inner = outer.new Inner();

            System.out.println(Outer.x); // access inner class variable using inner class reference


    }


 }