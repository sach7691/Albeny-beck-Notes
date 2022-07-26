
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Starting of CollectionTest class
public class CollectionTest{

    public static void main(String[] args){

        Animal d1 = new Dog("Puppy",2);
     Animal d2 = new Dog("Bunty",5);
     Animal c1 = new Cat("Sally",3);
     Animal c2 = new Cat("Nonis",8);
     Animal r1 = new Rabbit("Willy",6);

    //Creating ArrayList
     ArrayList<Animal> animals = new ArrayList<>();

     animals.add(d1);
     animals.add(d2);
     animals.add(c1);
     animals.add(c2);
     animals.add(r1);


     //for-each
    //  for(Animal a:animals){

    //     System.out.println(a);
    //  }

    //  //iterator
    //  Iterator it = animals.iterator();

    //  while(it.hasNext()){
   
    //     System.out.println(it.next());

    //  }

    //Creating a HashMap 

      HashMap<String,Animal> firstHashAnimals = new HashMap<>();

      firstHashAnimals.put("Dog", d1);
      firstHashAnimals.put("Cat", c1);
      firstHashAnimals.put("Rabbit", r1);

   

     //iterator
     /* 
     // Getting a Set of Key-value pairs
     Set entrySet = firstHashAnimals.entrySet();
 
     // Obtaining an iterator for the entry set
     Iterator itr = entrySet.iterator();

    // Iterate through HashMap entries(Key-Value pairs)
    System.out.println("HashMap Key-Value Pairs : ");
    while(itr.hasNext()){
    Map.Entry me = (Map.Entry)itr.next();
    System.out.println("Key is: "+me.getKey() + " & " + " Value : "+me.getValue());

    }*/


    //ForEach loop
    
    for(Map.Entry<String, Animal> entryFirst : firstHashAnimals.entrySet()) {
      String keyFirst = entryFirst.getKey();
     Animal valueFirst = entryFirst.getValue();

     System.out.println("Key is : " + keyFirst + ", Value is : "+ valueFirst);

    }



      HashMap<Animal,String> secondHashAnimals = new HashMap<>();

      secondHashAnimals.put(d2, "Doggy");
      secondHashAnimals.put(c2,"Catty");

      for(Map.Entry<Animal,String> entrySecond : secondHashAnimals.entrySet()) {
        Animal keySecond = entrySecond.getKey();
        String valueSecond = entrySecond.getValue();
  
       System.out.println("Key is : " + keySecond + ", Value is : "+ valueSecond);
  
      }
      

     }
    }

