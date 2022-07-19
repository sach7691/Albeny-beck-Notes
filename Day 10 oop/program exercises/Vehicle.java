
import java.io.*;

class Car{

    String carName;
    String carModel;
    double carPrice;

}

public class Vehicle{


 public static void main(String[] args) throws IOException{
  
    // Enter data using BufferReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    //create Car object array
    System.out.print("How many objects need to be created :");
    int x = Integer.parseInt(reader.readLine());

    Car[] cars = new Car[x];

    // Reading data using readLine and storing in the object array
    for(int i = 0 ; i < cars.length; i++){
      
        cars[i] = new Car(); //create Car object
        System.out.println("Enter your  Car Name: ");
        cars[i].carName = reader.readLine();
        System.out.println("Enter your  Car Model: ");                                                                                                                                                                          
        cars[i].carModel = reader.readLine();
        System.out.println("Enter your  Car Price: ");
        cars[i].carPrice = Double.parseDouble(reader.readLine());

    }

    for(Car c: cars){

        System.out.println(c.carName);
        System.out.println(c.carModel);
        System.out.println(c.carPrice);
    }

    
    }
}





 



