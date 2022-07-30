import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Iterator;
import java.util.ListIterator;

public class Conference{

// id, name, location, datetime

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
            scanner.nextLine(); //nextInt() does not consume the '\n', so the next call to nextLine() consumes it and then it's waiting to read the input for eLocation
            String eName = scanner.nextLine();
            System.out.println("Edit Event Location : ");
            String eLocation = scanner.nextLine();
            System.out.println("Edit DateTime : ");
            String eTimeDate = scanner.nextLine();

            Events editEvent = new Events(number2,eName,eLocation,eTimeDate);

            System.out.println();
            System.out.println("=====================Updated Event : ============================================");
            
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
           System.out.println("===============Delete an Event =========================================");
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
                System.out.println("=====================Print All List after Deletion of an Event : ========================");
                for(Events ev: list){
           
                    System.out.println(ev);
            
                   }

        //Attendees Details


        Attendees a1 = new Attendees(1, "IEEE", "SL", "27th October at 8 - 3 pm ", 1, "Sachini", "Finchley", "0718166920"); 
        Attendees a2 = new Attendees(3, "Springer", "Australia", "21st August at 8 - 3 pm ",2,"Sasika","High Banet","0712096086");
        Attendees a3 = new Attendees(4, "IEEE", "UK", "29th December at 8 - 3 pm ",3,"Roledene","Highgate","0779905952");
        Attendees a4 = new Attendees(4, "IEEE", "UK", "29th December at 8 - 3 pm ",4,"Anu","Bank","077345672");


         ArrayList<Attendees> alist = new ArrayList<>();

         alist.add(a1);
         alist.add(a2);
         alist.add(a3);
         alist.add(a4);


         System.out.println();
         System.out.println("===============List the Attendees Attending an Event========================= ");

         System.out.println();
         System.out.println("Enter an Event Id to list the Ateendees : ");
         int number4 = scanner.nextInt();
     
         ListIterator<Attendees>  itr3 = alist.listIterator();
    
         while (itr3.hasNext()) {

            Attendees eventAttend = itr3.next();

             if(eventAttend.getEventId() == number4){
           
                System.out.println(eventAttend.toString());
               }

         }

         System.out.println();
         System.out.println("===============Add an Attendee to an Event========================= ");
         
         ListIterator<Attendees>  itr4 = alist.listIterator();
    
          System.out.println("Enter an Attendee Id : ");
          int number5 = scanner.nextInt();
          System.out.println("Enter Attendee Name : ");
          scanner.nextLine(); 
          String aName = scanner.nextLine();
          System.out.println("Enter Attendee Address : ");
          String aAddress = scanner.nextLine();
          System.out.println("Enter Phone Number : ");
          String aPhone = scanner.nextLine();
 
          System.out.println("Enter an Event Id : ");
          int number6 = scanner.nextInt();

         

             for(Events event1 : list){

                if(event1.getEventId() == number6){
             
                    Attendees addAttendee1 = new Attendees(number6,event1.getEventName(), event1.getEventLocation(), event1.getEventTimeDate(), number5, aName, aAddress, aPhone);
                    itr4.add(addAttendee1);
                    break;
                }
                
                }
            

             System.out.println();
             System.out.println("=====================Print All List with Added Attendee : ========================");

             for(Attendees at: alist){

                System.out.println(at);
        
              }



        System.out.println();
        System.out.println("===============Delete an Attendee from an Event========================= ");

            
        System.out.println("Enter an Attendee Id : ");
        int number7 = scanner.nextInt();
        
        ListIterator<Attendees>  itr5 = alist.listIterator();
        
        while (itr5.hasNext()) {
            Attendees attendeeDelete = itr5.next();
        
            if(attendeeDelete.getAttendId() == number7){
        
                itr5.remove();
               }
             
                }
            System.out.println();
             System.out.println("=====================Print All List after Deletion of an Attendee : ========================");
             for(Attendees attDele: alist){
        
                 System.out.println(attDele);
         
                }


            

             

           
        
         
            

        









       
         
         












        }

        }
    





