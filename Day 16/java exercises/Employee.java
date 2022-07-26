
public class Employee{ //only one public class for a java file( If you have more than one public classes a single file a compile-time error will be generated.)

     private int employeeId;
     private String employeeName;

    //default constructor no parameter, but need to hardcord
     public Employee(){
        
        this.employeeId =1;
        this.employeeName = "Sachini";

     }

     //Constructor wich takes parameters
     public Employee(int employeeId,String employeeName){
        
        this.employeeId = employeeId;
        this.employeeName = employeeName;

     }

     //Setter methods
     public void setEmployeeId(int employeeId){

        this.employeeId = employeeId;
     }

     public void setEmployeeName(String employeeName){

        this.employeeName = employeeName;
     }

     //Getters method
     public int getEmployeeId(){

        return this.employeeId;

     }

     public String getEmployeeName(){

        return this.employeeName;
     }

     //toString method
     @Override
     public String toString(){


        return "Employee Id  is : " + this.employeeId + ", Employee Name : " + this.employeeName;
     }


}