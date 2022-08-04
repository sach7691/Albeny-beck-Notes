public class Attendees extends Events{

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

    public String getAddress(){

        return this.Address;
    }

    public String getPhoneNumber(){

        return  this.PhoneNumber;
    }

    @Override

    public String toString(){

        return "Details of Attendees along with the Event : " + super.toString()+ " | Id "+ this.attendId + " | Name " + this.attendName + " | Address " + this.Address + " | Tel " + this.PhoneNumber + "\n";
    }

    public String overWriteAttendee(){

        String originalStr = super.overWrite();
        originalStr = originalStr.replaceAll("[\n]", "");

        return  originalStr + ","+ this.attendId + "," + this.attendName + "," + this.Address + "," + this.PhoneNumber + "\n";
    }

    
}