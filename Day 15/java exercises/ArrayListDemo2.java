
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo2{

    public static void main(String[] args) {

    //here integer used instaed of int, because interger is an object type
        
    ArrayList<Integer> list = new ArrayList<Integer>();
   

    System.out.println("Size before elements: " + list.size()); //size :0

    //Add 3 objects 

    list.add(100);
    list.add(200);
    list.add(300);

    System.out.println("Size after adding 3 elements: " + list.size()); // size: 3

    
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
