

public class Events implements Actions{


     private int eventId;
     private String eventName;
     private String eventLocation;
     private String eventTimeDate;


     //Constructor to list all and individual event
     public Events(int eventId,String eventName, String eventLocation,String eventTimeDate){

        this.eventId = eventId;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventTimeDate = eventTimeDate;
       
     }

     //Setters
     public void setEventId(int eventId){

        this.eventId = eventId;
     }

     public void setEventName(String eventName){

        this.eventName = eventName;
     }

     public void setEventLocation(String eventLocation){

        this.eventLocation = eventLocation;
     }

     public void setEventTimeDate(String eventTimeDate){

        this.eventTimeDate = eventTimeDate;
     }

     //Getters
     public int getEventId(){

        return this.eventId;
     }

     public String getEventName(){

        return this.eventName;
     }

     public String getEventLocation(){

        return this.eventLocation;
     }

     public String getEventTimeDate(){

        return this.eventTimeDate;
     }

     @Override
     public String toString(){

        return "Event Id:  " + this.eventId + " | Event Name : " + this.eventName + "  | Event Location :  " + this.eventLocation + " | Event Date and Time :  " + this.eventTimeDate;

     }

     //Actions interface implementations starts here

     public void Edit(){
        
    //     e.setEventId(2);
    //     e.setEventName("Elsevier");
    //     e.setEventLocation("USA");
    //     e.setEventTimeDate("1st December 8 - 4 pm");

    //     System.out.println("Event is Successfully Edited");

     }

     public void Delete(){
        
       // Events e = new Events(eventId, eventName, eventLocation, eventTimeDate);

        StringBuffer sb = new StringBuffer();
        
        //clear the Stringbuffer content
	     sb.delete(0, sb.length());
	   
	     sb.append("String deleted ");
	   
	     System.out.println(sb.toString());	
        
     }

    //  public void ListAllEvents(){
    
    //     // Events e = new Events(eventId, eventName, eventLocation, eventTimeDate);
    //     // List<Event> list = new List<>();
    //     // list.add(e.toString());

    //     System.out.println("List All Events : ");

    //     for(Event ev: list){
   
    //         System.out.println(ev);

    //     }

        
    //  }

    //  public void ListIndividualEvent(){

        

    //     Events e = new Events(eventId, eventName, eventLocation, eventTimeDate);
    //     Map<Integer,Event> map = new HashMap<>();
    //     map.put(e.getEventId(),e.toString());

    //     Scanner scanner = new Scanner(new InputStreamReader(System.in));
    //     System.out.println("Enter an Event Id : ");
    //     int number = scanner.nextInt();

    //     System.out.println("List an Individual Event : ");
    //     for (Map.Entry<Integer,Event> entry : map.entrySet()) {
    //         String key = entry.getKey();
    //         String value = entry.getValue();
    //         if (number == Integer.parseInt(entry.getKey())){

                
    //             System.out.println(entry.get() + " , "+ entry.getValue());

    //         }
    //     }

        






    //  }

     

}