public class Attendees extends Events implements Actions{

    private int attendId;
    private String attendName;
    private String Address;
    private String PhoneNumber;

    //Constructor takes all the parameters
    public Attendees(int eventId,String eventName, String eventLocation,String eventTimeDate,int attendId,String attendName,String Address,String PhoneNumber){

        super(eventId, eventName, eventLocation, eventTimeDate);
        this.attendId = attendId;
        this.attendName = attendName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }
  

    public void setAttendId(int attendId){

        this.attendId = attendId;
    }

    public void setAttendName(String attendName){

        this.attendName = attendName;

    }

    public void setAddress(String Address){

        this.Address = Address;
    }

    public void setPhoneNumber(String PhoneNumber){

        this.PhoneNumber = PhoneNumber;
    }

    //getters

    public int getAttendId(){

        return this.attendId;
    }

    public String getAttendName(){

        return this.attendName;

    }

    public String setAddress(){

        return this.Address;
    }

    public String setPhoneNumber(){

        return  this.PhoneNumber;
    }

    @Override

    public String toString(){

        return "List of Attendees attending an event : " + super.toString()+ " , "+ this.attendId + " , " + this.attendName + " , " + this.Address + " , " + this.PhoneNumber;
    }


    // //Actions interface implementations starts here

    // public void Edit(){

    //     Events e = new Events(eventId, eventName, eventLocation, eventTimeDate);
    //     Events at = new Attendees(eventId, eventName, eventLocation, eventTimeDate, attendId, attendName, Address, PhoneNumber);
        
    //     at.setEventId(eventId);
    //     at.setEventName(eventName);
    //     at.setAttendId(attendId);
    //     at.setAttendName(attendName);
    //     at.setAddress(Address);
    //     at.setPhoneNumber(PhoneNumber);

    //     System.out.println("Attendee is Successfully Edited");

    //  }

    //  public void Delete(){
        
    //     Events e = new Events(eventId, eventName, eventLocation, eventTimeDate);

    //     StringBuffer sb = new StringBuffer(e.toString());
        
    //     //clear the Stringbuffer content
	//      sb.delete(0, sb.length());
	   
	//      sb.append("String deleted ");
	   
	//      System.out.println(sb.toString());	
        
    //  }

    
}