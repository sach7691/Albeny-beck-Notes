public class ExcepDemo1{

    public static void main(String[] args){



        try {

            System.out.println(10/0);
            
        } catch (ArithmaticException ae) { //ae is reference variable of ArithmaticException type
            
            System.out.println("ArithmaticException caught due to divide by ZERO"); //with catch block we can customized the error message

        }




    }
}