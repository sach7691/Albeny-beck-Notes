
//STEP 1
class Student{

    int studentId;
    String studentName;
 
 } //end of student class
 
 //STEP 2
 class ClassDemo3{ // this is a main class (class with main method)
 
     public static void main(String[] args) {
 
         Student s1 = new Student();
         Student s2 = new Student();
         Student s3 = new Student();
 
 
     //STEP 3
 
     s1.studentId = 1;
     s1.studentName = "Sachini";

     s2.studentId = 2;
     s2.studentName = "Sasika";

     s3.studentId = 3;
     s3.studentName = "Sajani";
 
     //STEP 4
     
     
     Student[] students = {s1,s2,s3};

     for(Student s : students){

        System.out.println(s.studentId);
        System.out.println(s.studentName);

     }
     
 
         
     }
  
  
  
  }