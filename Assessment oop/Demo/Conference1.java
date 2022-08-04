    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;



        public class Conference1 {

            public static void main(String[] args) {

                Conference1 conference1 = new Conference1();
                conference1.printMenu();
                int menuId = conference1.getInput("Enter your Choice :");

                switch (menuId) {
                    case 1:{
                        System.out.println("======List All Events=====");
                        ArrayList<Events> events = conference1.readFileEvent();
                        System.out.println(events.toString());
                        break;
                        }
                    case 2:{
                        System.out.println("======List An Individual Event=====");
                        ArrayList<Events> events = conference1.readFileEvent();
                        int eventId = conference1.getInput("Enter Event Id :");
                        conference1.listAnEvent(events, eventId);
                        break;
                    }
                    case 3:{
                        System.out.println("======Edit an Event=====");
                        ArrayList<Events> events = conference1.readFileEvent();
                        int eventId = conference1.getInput("Enter Event Id :");
                        ArrayList<Events> event1= conference1.editEvent(events, eventId);
                        try{                       
                        if(event1 != null){   
                           conference1.writeToFileEvents(event1);
                        }else{ 
                            MyException myExp = new MyException("If Event does not exist then print null");
                            throw myExp;     
                           
                        }
                         }catch(MyException me){

                        System.out.println(me);
                         }
                        break;
                        }
                    case 4:{
                        System.out.println("======Delete an Event=====");
                        ArrayList<Events> events = conference1.readFileEvent();
                        int eventId = conference1.getInput("Enter Event Id :");
                        conference1.deleteEvent(events, eventId);
                        conference1.writeToFileEvents(events);
                        break;
                    }
                    case 5:{
                        System.out.println("======List the Attendees attending an event=====");
                        ArrayList<Attendees> attendees = conference1.readFileAttendee();
                        System.out.println(attendees.toString());
                        break;
                    }
                    case 6:{
                        System.out.println("======Add an Attendee to an Event=====");
                        ArrayList<Attendees> attendees = conference1.readFileAttendee();
                        int attendeeId = conference1.getInput("Enter an Attendee Id :");
                        int eventId = conference1.getInput("Enter Event Id :");
                        ArrayList<Attendees> attendees1 = conference1.addAttendees(attendees, attendeeId, eventId);
                        conference1.writeToFileAttendee(attendees1);
                        break;
                    }
                    case 7:{
                        System.out.println("======Delete an Attendee=====");
                        ArrayList<Attendees> attendees = conference1.readFileAttendee();
                        int attendeeId = conference1.getInput("Enter Attendee Id :");
                        ArrayList<Attendees> arr = conference1.deleteAttendee(attendees, attendeeId);
                        conference1.writeToFileAttendee(arr);
                        break;
                    }
                    case 8:{
                        System.out.println("Exit");
                        break;
                        }
                    }
                    
            }

            public void writeToFileAttendee(ArrayList<Attendees> attendees){

                BufferedWriter bw = null;
                try{
                    
                    FileWriter fw = new FileWriter("AttendeeDetails.txt",false);
                    bw = new BufferedWriter(fw);
                    ArrayList<Attendees> attendees1 = attendees;


                    for (int i = 0; i < attendees1.size(); i++) {
                        bw.write(attendees1.get(i).overWriteAttendee());
                        bw.flush();

                    }            
            
                }
                catch(NumberFormatException fn){

                    System.out.println(fn);
                    

                }
                catch(IOException io){

                    System.out.println(io);
                    

                }

            }

            public ArrayList<Attendees> addAttendees(ArrayList<Attendees> attendees,int attendeeId,int eventId)throws IndexOutOfBoundsException{

                boolean isAttendeeFound = false;
                boolean isEventFound = false;
                BufferedReader br = null;
                try{
                br = new BufferedReader(new InputStreamReader(System.in));
            
                Conference1 conference1 = new Conference1();
                ArrayList<Events> events = conference1.readFileEvent();
                Events e = conference1.listAnEvent(events, eventId);
                Attendees a = conference1.listAnAttendee(attendees, attendeeId);
                
                for(Attendees at: attendees){

                    if(!attendees.contains(a) && events.contains(e)){ //check whether 2 objects are exist in the array list
                    
                    System.out.println("Enter Attendee Details : ");
                    System.out.println("Add Attendee Name : ");
                    String aName = br.readLine();
                    System.out.println("Add Attendee Address : ");
                    String aAddress = br.readLine();
                    System.out.println("Add Attendee Phone Number : ");
                    String aPhoneNumber = br.readLine();
        
                    Attendees a1= new Attendees(e.getEventId(), e.getEventName(), e.getEventLocation(), e.getEventTimeDate(),attendeeId, aName, aAddress, aPhoneNumber);
                    attendees.add(a1);
                    System.out.println();
                    System.out.println(attendees);
                    isAttendeeFound = false;
                    isEventFound = true;

                    return attendees;
                    }
                    else{

                        isAttendeeFound = true;
                        isEventFound = false;
                    }       
                    
                }
                

                }
                catch(NumberFormatException fn){

                    System.out.println(fn);
                    

                }
                catch(IOException io){

                    System.out.println(io);
                    

                }
                
                return null;

            }

            

            public ArrayList<Attendees> readFileAttendee(){

                BufferedReader br = null;
                ArrayList<Attendees> attendees = new ArrayList<>();

                try {
                    String content;
                    
                
                    br = new BufferedReader(new FileReader("AttendeeDetails.txt"));
                
                    while ((content = br.readLine()) != null) {
                                    
                        String str[] = content.split(",");   
                        Attendees a = new Attendees(Integer.parseInt(str[0]), str[1], str[2], str[3],Integer.parseInt(str[4]),str[5],str[6],str[7]);
                    
                        attendees.add(a);

                    }                
                
                } 
                catch (FileNotFoundException fn) {
                
                    System.out.println(fn);
                
                }catch (IOException io) {
                
                    System.out.println(io);
                
                }
                return attendees;

            }
            public ArrayList<Attendees> deleteAttendee(ArrayList<Attendees> attendees,int attendeeId){

                boolean isAtendeeFound = false;
                BufferedReader br = null;
                int index = 0;
                try{
                br = new BufferedReader(new InputStreamReader(System.in));
                for(Attendees at: attendees){

                    ArrayList<Attendees> arr = attendees;

                    if(at.getAttendId() == attendeeId){
        
                    System.out.println("Attendee Id Found,Deleted the Entry !! ");
                    attendees.remove(index);
                    isAtendeeFound = true;
                
                    //System.out.println(arr);
                    
                    return arr;
                    }
                    else{

                        isAtendeeFound = false;
                    }    
                    
                    index ++;
                    
                }

                if(!isAtendeeFound){
                    
                    System.out.println("Attendee Id does not Exist !! ");
                }

                }
            
                catch(NumberFormatException fn){

                    System.out.println(fn); 

                }
                
                return null;

            }

            
            public Events deleteEvent(ArrayList<Events> events,int eventId){
        
                boolean isEventFound = false;
                BufferedReader br = null;
                int index = 0;
                try{
                br = new BufferedReader(new InputStreamReader(System.in));
                for(Events ev: events){

                    if(ev.getEventId() == eventId){
        
                    System.out.println("Event Id Found, Please Delete the Entry !! ");
                    events.remove(index);

                    System.out.println(events.toString());
                    isEventFound = true;

                    return ev;
                    }
                    else{

                        isEventFound = false;
                    }    
                    
                    index ++;
                    
                }

                if(!isEventFound){
                    
                    System.out.println("Event Id does not Exist !! ");
                }

                }
            
                catch(NumberFormatException fn){

                    System.out.println(fn);
                    

                }
            
            
                
                return null;

            }

            public ArrayList<Events> editEvent(ArrayList<Events> events,int eventId){
        
                boolean isEventFound = false;
                BufferedReader br = null;
                try{
                br = new BufferedReader(new InputStreamReader(System.in));
                for(Events ev: events){

                    if(ev.getEventId() == eventId){
        
                    System.out.println("Event Id Found, Please Enter the Details !! ");
                    System.out.println("Edit Event Name : ");
                    String eName = br.readLine();
                    System.out.println("Edit Event Location : ");
                    String eLocation = br.readLine();
                    System.out.println("Edit DateTime : ");
                    String eTimeDate = br.readLine();
        
                    Events eEvent = new Events(eventId,eName,eLocation,eTimeDate);
                    System.out.println(eEvent);
                    //System.out.println(eventId);
                    Conference1 conference1 = new Conference1();
                    conference1.deleteEvent(events,eventId);
                    events.add(eEvent);
                    System.out.println(events);
                    isEventFound = true;
            
                    return events;
                    }
                    else{

                        isEventFound = false;
                    }       
                    
                }

                if(!isEventFound){
                    
                    System.out.println("Event Id does not Exist !! ");
                }

                }
                catch(NumberFormatException fn){

                    System.out.println(fn);
                    

                }
                catch(IOException io){

                    System.out.println(io);
                    

                }
                
                return null;

            }

            public Events listAnEvent(ArrayList<Events> events,int eventId){
            
                boolean isEventFound = false;
                for(Events ev: events){

                if(ev.getEventId() == eventId){
                System.out.println("An Event Found !!");
                System.out.println(ev.toString());
                isEventFound = true;
                return ev;
                }
                else{
                    isEventFound = false;
                }
                
                }
                if (!isEventFound){
                    System.out.println("An Event Not Found !!");
                }

                return null;

            }

            public Attendees listAnAttendee(ArrayList<Attendees> attendees,int attendeeId){
            
                boolean isAttendeeFound = false;
                for(Attendees at: attendees){

                if(at.getAttendId() == attendeeId){
                System.out.println("An Attendee Found !!");
                System.out.println(at.toString());
                isAttendeeFound = true;
                return at;
                }
                else{
                    isAttendeeFound = false;
                }
                
                }
                if (!isAttendeeFound){
                    System.out.println("An Attendee Not Found !!");
                }

                return null;

            }


            
            public ArrayList<Events> readFileEvent(){

                BufferedReader br = null;
                ArrayList<Events> events = new ArrayList<>();

                try {
                    String content;
                    
                
                    br = new BufferedReader(new FileReader("EventsDetails.txt"));
                
                    while ((content = br.readLine()) != null) {
                                    
                        String str[] = content.split(",");  
                        Events e = new Events(Integer.parseInt(str[0]), str[1], str[2], str[3]);
                    
                        events.add(e);

                    }                
                
                } 

                catch (FileNotFoundException fn) {
                
                    System.out.println(fn);
                
                }catch (IOException io) {
                
                    System.out.println(io);
                
                }
                return events;
            }

            public void writeToFileEvents(ArrayList<Events> events){

                BufferedWriter bw = null;
                try{
                    
                    FileWriter fw = new FileWriter("EventsDetails.txt",false);
                    bw = new BufferedWriter(fw);
                    ArrayList<Events> event1 = events;


                    for (int i = 0; i < event1.size(); i++) {
                       // System.out.println(events1.get(i).overWrite());
                        bw.write(event1.get(i).overWrite());
                        bw.flush();
                    
                    }            
                    
                }
                catch(NumberFormatException fn){

                    System.out.println(fn);
                    

                }
                catch(IOException io){

                    System.out.println(io);
                    

                }


            }

            public void printMenu(){

                System.out.println("*************************************** MENU ***********************************************");
                System.out.println("1. List All Events");
                System.out.println("2. List an individual event");
                System.out.println("3. Edit an event");
                System.out.println("4. Delete an event");
                System.out.println("5. List the attendees attending an event");
                System.out.println("6. Add an attendee to an event");
                System.out.println("7. Delete an attendee from an event");
                System.out.println("8. Exit the program");

            }

            public int getInput(String msg){

                BufferedReader br = null;
                System.out.println(msg);
                try{
                br = new BufferedReader(new InputStreamReader(System.in));
                int input = Integer.parseInt(br.readLine());
                return input;
                }
                catch(IOException io){

                    System.out.println(io);
                    return 0;

                }
                
            }

        }


