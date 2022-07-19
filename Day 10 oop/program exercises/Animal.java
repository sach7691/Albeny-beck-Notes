
import java.io.*;

class Dog{
     String name;
     int age;
     String owner;
}

public class Animal{

 public static void main(String[] args) throws IOException{
  
    // Enter data using BufferReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    // Reading data using readLine
   
    //create object array
    Dog[] dogs = new Dog[2];


    for(int i=0;i<dogs.length;i++){
        dogs[i] = new Dog();
        System.out.print("Enter your  Dog Name: ");
        dogs[i].name = reader.readLine();

        System.out.print("Enter your  Dog Age: ");
        dogs[i].age = reader.read();

        System.out.print("\nEnter your  Dog Onwer: ");
        dogs[i].owner = reader.readLine();
    }

    for(Dog d : dogs){
        System.out.println("======================================");
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.owner);
    }

    // for(String i : arr){
    // System.out.print("Enter your  Car Name: ");
    // String carName = reader.readLine();
    // System.out.print("Enter your  Car Model: ");
    // String carModel = reader.readLine();
    // System.out.print("Enter your  Car Price: ");
    // double carPrice = Double.parseDouble(reader.readLine());
    // // arr[i] = carName;
    // System.out.println(i);
    
    // }

    //  for(int x = 0; x < arr.length ; x++){
     
     
    //    System.out.println(arr[x]);
    //  }

    
}


}



 



