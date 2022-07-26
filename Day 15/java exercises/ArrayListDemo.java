

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo{

    public static void main(String[] args) {
        
    ArrayList list = new ArrayList();

    System.out.println("Size before elements: " + list.size()); //size :0

    //Add 3 objects 

    list.add(100);
    list.add(200);
    list.add(300);

    System.out.println("Size after adding 3 elements: " + list.size()); // size: 3

    //add another 2 objects
    list.add("Sachini");
    list.add("Sasika");

    System.out.println("Size after 2 more elements: " + list.size()); // size: 5
    
    //print whole list
    System.out.println(list);

    //For loop to print an array

    for (Object arr : list) {

        System.out.println(arr);
        
    }

    //Display the ArrayList values using iterator
    //Before we attempt to use iterator we need to create it first
    //Iterator is an interface

    Iterator it = list.iterator();

    while(it.hasNext()){ //this return true if there has a next item

       int value = (int) it.next(); // return next available value
       
       System.out.println(value);
        
    }


    }

}
