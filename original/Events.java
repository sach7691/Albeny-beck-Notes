

public class Events{


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

        return "Event Id:  " + this.eventId + " | Event Name : " + this.eventName + "  | Event Location :  " + this.eventLocation + " | Event Date and Time :  " + this.eventTimeDate + "\n";

     }
     
     public String overWrite(){

      return  this.eventId + "," + this.eventName + "," + this.eventLocation + "," + this.eventTimeDate+"\n";

    }

     

}