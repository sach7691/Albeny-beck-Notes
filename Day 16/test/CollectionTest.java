
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Starting of CollectionTest class
public class CollectionTest{

    public static void main(String[] args){


     Animal d1 = new Dog("Puppy",10);
     Animal d2 = new Dog("Bunty",5);
     Animal c1 = new Cat("Sally",3);
     Animal c2 = new Cat("Nonis",8);
     Animal r1 = new Rabbit("Willy",6);

    //Creating ArrayList ----------------------------------------------------------------------------
     ArrayList<Animal> animals = new ArrayList<>();

     animals.add(d1);
     animals.add(d2);
     animals.add(c1);
     animals.add(c2);
     animals.add(r1);

     Collections.sort(animals);
     


     //for-each prints Sorting based on age------------------------------------------------------------------------------------------------------
     System.out.println("Sorted ArrayList based on Age : ");
     for(Animal a:animals){

        System.out.println(a);
     }

    //  //iterator prints the Sorted Array list--------------------------------------------------------------------------------
    //  Iterator it = animals.iterator();

    //  while(it.hasNext()){
   
    //     System.out.println(it.next());

    //  }

    //Creating First HashMap ------------------------------------------------------------------------------
 
      HashMap<String,Animal> firstHashAnimals = new HashMap<>();

      firstHashAnimals.put(d1.getAnimalName(), d1);
      firstHashAnimals.put(c1.getAnimalName(), c1);
      firstHashAnimals.put(r1.getAnimalName(), r1);
      firstHashAnimals.put(d2.getAnimalName(),d2);
      firstHashAnimals.put(c2.getAnimalName(),c2);
    //   firstHashAnimals.put(c2.getAnimalName(),c2);
    //   firstHashAnimals.put(r1.getAnimalName(), r1);
    //   firstHashAnimals.put(d2.getAnimalName(),d2);

   

     //iterator
     
     // Getting a Set of Key-value pairs
     Set entrySet = firstHashAnimals.entrySet();
 
     // Obtaining an iterator for the entry set
     Iterator itr = entrySet.iterator();

    // Iterate through HashMap entries(Key-Value pairs)
    System.out.println("Unsorted HashMap Key-Value Pairs : ");
    while(itr.hasNext()){
    Map.Entry me = (Map.Entry)itr.next();
    System.out.println("Key is: "+me.getKey() + " \t | " + " Value : "+me.getValue());

    String s = me.getKey().toString();
    //Search a specific key by Animal name 
    if(s.contains("Nonis")){

        System.out.println( me.getKey().toString());
    }
    
    } 


    //Sorted Map implementation-------------------------------------------------------------------
    System.out.println("Sorted HashMap Key-Value Pairs : ");
    Map<String,Animal> treeMap = new TreeMap<String,Animal>(firstHashAnimals);

    for(Map.Entry<String,Animal> en : treeMap.entrySet()){

        System.out.println( "Sorted key values : " + en.getKey());
    }




    //ForEach loop 
    
    // for(Map.Entry<String, Animal> entryFirst : firstHashAnimals.entrySet()) {
    //   String keyFirst = entryFirst.getKey();
    //  Animal valueFirst = entryFirst.getValue();

    //  System.out.println("Key is : " + keyFirst + " \t  |Value is : "+ valueFirst);

    // }


    //Second Hash-Map starts here-----------------------------------------------------------------

    //   HashMap<Animal,String> secondHashAnimals = new HashMap<>();

    //   secondHashAnimals.put(d2, "Doggy");
    //   secondHashAnimals.put(c2,"Catty");
    //   secondHashAnimals.put(r1,"Rabbitto");
    //   secondHashAnimals.put(c1,"Cutter");

    //   for(Map.Entry<Animal,String> entrySecond : secondHashAnimals.entrySet()) {
    //     Animal keySecond = entrySecond.getKey();
    //     String valueSecond = entrySecond.getValue();
  
    //    System.out.println("Key is : " + keySecond + " \t  |Value is : "+ valueSecond);
  
    //   }
    

     }
    }

