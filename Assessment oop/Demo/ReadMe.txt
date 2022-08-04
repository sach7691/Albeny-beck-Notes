==========This Document shows the the structure of the EMS Project===============

1. Project Scenario: Research Conference

OOP Concepts used : Inheritance, Encapsulation

class Events : Holds the Conference details (super-class)
class Attendees : Hold the Attendees details (sub-class)

class MyException : Handle the UD Exception in the class Conference1 main program.(inherits the Exception class features)

class Conference1 : This is the Final outcome after conducting research and testing. 
(Contains switch case,Collections : ArrayLists,UD Exception, File handling with bufferedReader and bufferedWriter,input validation)

class Conference : Dummy outcome which used for testing along with each function given in the assignment.  But without error handling,file handling,input validation.


EventsDetails.txt : Holds the events variable values by comma seperated values.

AttendeesDetails.txt : Holds the Attendees variable values by comma seperated values.

2.Functions:

Each function reads the corresponding txt file records to add to the ArrayList.

Edit,Delete,Add functions writes final output to the corresponding txt file.

