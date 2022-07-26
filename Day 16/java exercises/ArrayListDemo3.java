import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3{

    public static void main(String[] args){


    Employee e1 = new Employee();
    Employee e2 = new Employee(2,"Anu");
    Employee e3 = new Employee(3,"Sasika");

    //<> : Called generics, in java 7 onwards no need to specify type in right handside 
    ArrayList<Employee> list = new ArrayList<>();

    list.add(e1);
    list.add(e2);
    list.add(e3);


    //For each
    //for(Data-type reference/variable : Collection /array name)

    // for(Employee em:list){

    //     System.out.println(em);
    // }

    //iterator
    Iterator<Employee> it = list.iterator();

    while(it.hasNext()){

        System.out.println(it.next());
    }

    //Fetch an object from a collection/arraylist
   // System.out.println(list.get(0));

    //Remove an object from an array list

    list.remove(0);
    System.out.println(list.get(0));

    //Display all objects in the collection
    System.out.println(list);

    //Add a new object at a specified index
    list.add(1,e1); //method overloading add() takes different parameters (earlier it took just the object now it takes index and parameter)
    System.out.println(list);

    //modify the content in the object
    e1.setEmployeeName("Roledene");

    System.out.println(list);





    }
}