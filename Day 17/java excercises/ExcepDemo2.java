public class ExcepDemo2{

    public static void main(String[] args){



        try {
            
            int a = Integer.parseInt(args[0]);

            int b = Integer.parseInt(args[1]);

            double d = Double.parseDouble(args[2]);
            
            System.out.println(10/0);
            
        } catch (ArithmaticException ae) { //ae is reference variable of ArithmaticException type
            
            System.out.println("ArithmaticException caught due to divide by ZERO"); //with catch block we can customized the error message

        }

        catch (ArrayIndexOutOfBoundsException ai) { //ai is reference variable of ArrayIndexOutOfBoundsException type
            
            System.out.println("Index out of bound caught"); //with catch block we can customized the error message

        }
        catch (NumberFormatException ne ) { //ne is reference variable of NumberFormatException type
            
            System.out.println(ne.getMessage()); //shortcut to get the message
        }

        catch (Exception e ) { //exception class can hold all types of exception objects
            
            System.out.println(e); //shortcut to get the message
        }




    }
}