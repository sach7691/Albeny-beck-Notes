import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo1{

    public static void main(String[] args){
 

   Scanner sc = new Scanner(System.in);
   HashMap<String,Integer> scoreCard = new HashMap<>();
   
   scoreCard.put("Alex",200);
   scoreCard.put("Temi",250);
   scoreCard.put("Jon",300);
   scoreCard.put("James",300);

  
    
   //ordered set will print according to internal hash codes
   System.out.println(scoreCard);

   //to get the one of the entry

   System.out.println(scoreCard.get("Alex"));
   
   System.out.println("Enter name :");

   String name = sc.nextLine();

   System.out.println(name + "has scored : " + scoreCard.get(name));
   

   if (scoreCard.get(name) == null){

    System.out.println("Key does not exist");

   }

   else{

    System.out.println(name + " has scored : " + scoreCard.get(name));
   }

   //Update a score of the player

   scoreCard.put("Temi",400);


   //--------------------------------------------

   HashMap<Integer,Employee> employees = new HashMap<>();


   Employee e1 = new Employee(1,"Sachini");
   Employee e2 = new Employee(2,"Alex");
   Employee e3 = new Employee(3,"Mak");

   employees.put(1,e1);
   employees.put(2,e2);
   employees.put(3,e3);

   //update an employee name stored in hashmap

   //Step 1: 

   Employee retrieveEmp = employees.get(2);

   //Step 2: update retrived object
   
   retrieveEmp.setEmployeeName("Sachini");

   //Step 3: Put back in the map

    employees.replace(retrieveEmp.getEmployeeId(),retrieveEmp); // Key is given
    
    System.out.println(employees);

    }

}