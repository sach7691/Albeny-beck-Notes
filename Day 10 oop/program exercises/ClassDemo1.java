
//STEP 1
class Student{

   int studentId;
   String studentName;

} //end of student class

//STEP 2
class ClassDemo1{ // this is a main class (class with main method)

    public static void main(String[] args) {

        Student s1 = new Student();


    //STEP 3

    s1.studentId = 1;
    s1.studentName = "Sachini";

    //STEP 4
    System.out.println(s1.studentId);
    System.out.println(s1.studentName);
    

        
    }
 
 
 
 }