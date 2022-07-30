import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Conference {

    // id, name, location, datetime

    public static void main(String[] args)  throws IOException {

        Conference conference = new Conference();
        conference.printMenu();
        int menuId = conference.getInput("Please enter the Menu ID : ");

        switch(menuId){
            case 1:{
                ArrayList<Events> eventList = conference.getEvents();
                break;
            }
            case 2:{
                ArrayList<Events> eventList = conference.getEvents();
                int eventId = conference.getInput("Please enter the event ID : ");
                conference.listAnEvent(eventList,eventId);
            }
            case 3:{
                ArrayList<Events> eventList = conference.getEvents();
                int eventId = conference.getInput("Please enter the event ID : ");
                Events event = conference.listAnEvent(eventList,eventId);
                
            }
            default:
        }


    }


    public int getInput(String message) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        int input = Integer.parseInt(br.readLine());
        return input;
    }


    public Events listAnEvent(ArrayList<Events> eventList, int input)  {
        boolean isEventFound = false;
        

        for(Events e : eventList){
            if(e.getEventId() == input){
                System.out.println("An event found!");
                System.out.println(e.toString());
                isEventFound = true;
                return e;
            }else{
                isEventFound = false;
            }
        }

        if(!isEventFound){
            System.out.println("Sorry! Event couldn't find.");
        }
        return null;
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

    public ArrayList<Events> getEvents(){
        String line = "";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            System.out.println("===============List All Events========================= ");
            ArrayList<Events> list = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader("events.csv"));
            while ((line = br.readLine()) != null) // returns a Boolean value
            {
               
                String[] events = line.split(splitBy); // use comma as separator
                System.out.println("ID : " + events[0] + " Name : " + events[1]
                        + "Location : " + events[2] + " Datetime : " + events[3]);
                        
                        Events e = new Events(Integer.parseInt(events[0]), events[1], events[2], events[3]);
                        list.add(e);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        // finally{
        //     br.close();
        // }
    }

}