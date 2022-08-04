import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class LambdaDemo1{


    public static void main(String[] args){


        List<Employee> employees = Arrays.asList(new Employee(1, "Sachini"),new Employee(2, "Anu"));
   
      /*  List the list using foreach
       
        employees.forEach(e ->System.out.println(e.toString()));
      */

     /*  use consumer to accept input and do using input something and do not return anything
     Annonymous inner clas

       employees.forEach(new Consumer<Employee>() {

        public void accept(Employee e){

            System.out.println(e.getName());
        }
        
       });
    */

    /* Consumer using lambda expression

       Consumer<Employee> emp = e -> {
        
        System.out.println(e);

       };

       emp.accept(employees.get(0));
       emp.accept(employees.get(1));
     */
       

     //===============================STREAMS===============================

    /* 
     print employee name startswith "S" and endsWidth "i"

     employees.stream()
              .filter(e -> e.getName().startsWith("S"))
              .filter(e-> e.getName().endsWith("i"))
              .forEach(e -> System.out.println(e));
     
     */

    /*predicates represent single argument functions that return a boolean*/

  employees.stream()
            .filter(new Predicate<String>() {

                public boolean test(String name){

                    return e.startsWith("S");
                }
                
            })
            .forEach(new Consumer<String>() {

                public void accept(String ex) {
                    
                    System.out.println(ex);
                }
                
            });







        


    }

}