public class Employee{

  private int empId;

  private String empName;



  public Employee(int empId,String empName){

     this.empId = empId;
     this.empName = empName;

  }

//   public void setId(int empId){

//     this.empId = empId;
//   }
//  public void setEmpName(String empName){

//     this.empName = empName;
//  }
  public int getId(){

    return this.empId;
  }
  
  public String getName(){

    return this.empName;
  }

  @Override
  public String toString(){

    return "ID is : " + this.empId + ",  Name : " + this.empName;
  }

}