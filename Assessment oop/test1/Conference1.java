import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Iterator;
import java.util.ListIterator;

public class Conference1{



   public static void main(String[] args){


    Events e1 = new Events(1, "IEEE", "SL", "27th October at 8 - 3 pm ");
    Events e2 = new Events(2, "ACM", "USA", "20th November at 9 - 4 pm ");
    Events e3 = new Events(3, "Springer", "Australia", "21st August at 8 - 3 pm ");
    Events e4 = new Events(4, "IEEE", "UK", "29th December at 8 - 3 pm ");


    System.out.println("===============List All Events========================= ");
    ArrayList<Events> list = new ArrayList<>();

    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);

    for(Events ev: list){

        System.out.println(ev);

    }
    
    System.out.println();
    System.out.println("===============List an Individual Event =================");
    HashMap<Integer,Events> map = new HashMap<>();
     map.put(e1.getEventId(),e1);
     map.put(e2.getEventId(),e2);
     map.put(e3.getEventId(),e3);
     map.put(e4.getEventId(),e4);

    Scanner scanner = new Scanner(new InputStreamReader(System.in));
    System.out.println("Enter an Event Id : ");
    int number1 = scanner.nextInt();
    
    for (Map.Entry<Integer,Events> entry : map.entrySet()) {
    Events value = entry.getValue();
    if (number1 == entry.getKey()){

        System.out.println( value);
      }
    
    }

        System.out.println();
        System.out.println("===============Edit an Event =================");
        System.out.println("Enter an Event Id : ");
        int number2  = scanner.nextInt();
        
        ListIterator<Events>  itr1 = list.listIterator();
    
        while (itr1.hasNext()) {
            Events e = itr1.next();

            if(e.getEventId() == number2){
            System.out.println("Edit Event Name : ");
            String eName = scanner.nextLine();
            System.out.println("Edit Event Location : ");
            String eLocation = scanner.nextLine();
            System.out.println("Edit DateTime : ");
            String eTimeDate = scanner.nextLine();

            Events editEvent = new Events(number2,eName,eLocation,eTimeDate);

            System.out.println();
            System.out.println("=====================Updated Event : ========================");
            
            itr1.set(editEvent); 
            System.out.println(editEvent.toString());
            System.out.println();
            System.out.println("=====================Print All List with Updated Event : ========================");
            for(Events ev: list){

                System.out.println(ev);
        
              }
  
              }

        }

           System.out.println();
           System.out.println("===============Delete an Event =================");
           System.out.println("Enter an Event Id : ");
           int number3  = scanner.nextInt();
           
           ListIterator<Events>  itr2 = list.listIterator();
           
           while (itr2.hasNext()) {
               Events eventDelete = itr2.next();
           
               if(eventDelete.getEventId() == number3){
           
                   itr2.remove();
                  }
                
                   }
               System.out.println();
                System.out.println("=====================Print All List after Deletion an Event : ========================");
                for(Events ev: list){
           
                    System.out.println(ev);
            
                   }



                   System.out.println();
                   System.out.println("===============Add an Attendee to an Event========================= ");
                   
                  //  ListIterator<Attendees>  itr4 = alist.listIterator();
              
                  //      System.out.println("Enter an Attendee Id : ");
                  //      int number5 = scanner.nextInt();
          
                  //      while (itr4.hasNext()) {
                  //         Attendees a = itr4.next();
          
                       
                  //         Boolean isAttendeeFound = false;
                  //    //  for(Attendees al : alist ){
           
                  //      if(a.getAttendId() == number5){
                       
                  //       System.out.println("Attendee Already Exist !!");
          
                  //       isAttendeeFound =true;
                  //       break;
                  //      }
                      
                  //      }
                  //      System.out.println("Enter Attendee Name : ");
                  //      scanner.nextLine(); 
                  //      String aName = scanner.nextLine();
                  //      System.out.println("Enter Attendee Address : ");
                  //      String aAddress = scanner.nextLine();
                  //      System.out.println("Enter Phone Number : ");
                  //      String aPhone = scanner.nextLine();
           
                  //      System.out.println("Enter an Event Id : ");
                  //      int number6 = scanner.nextInt();
          
                  //        for(Events event1 : list){
          
                  //         if(event1.getEventId() == number6){
                       
                  //             Attendees addAttendee1 = new Attendees(number6,event1.getEventName(), event1.getEventLocation(), event1.getEventTimeDate(), number5, aName, aAddress, aPhone);
                  //             itr4.add(addAttendee1);
                  //             break;
                  //         }
                          
                  //     }
          
                  //      System.out.println();
                  //      System.out.println("=====================Print All List with Added Attendee : ========================");
          
                  //      for(Attendees at: alist){
          
                  //         System.out.println(at);
                  
                  //       }
          
          












        }

        }
    





