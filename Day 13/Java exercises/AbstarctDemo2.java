


//MULTI-LEVEL INHERITANCE
abstract class Person{

    //Abstarction is a process of creating generalized class with some common features and they are inherited by the cpecialized classes
    public abstract void designSpec();
    public abstract void developCode();
    public abstract void testCode();
    public abstract void releseCode();
    public abstract void maintainCode();


}

abstract class BA extends Person{

    //this class will override only designSpec rest of the 4 abstarct methods in the super class were not implemented
    public void designSpec(){


    }

    // 4 abstract methods

    // public abstract void developCode();
    // public abstract void testCode();
    // public abstract void releseCode();
    // public abstract void maintainCode();

}

abstract class Developer extends BA{

    //this class can override developCode in BA 
 public void developCode(){

 }
     // 3 abstract methods
    // public abstract void testCode();
    // public abstract void releseCode();
    // public abstract void maintainCode();


}

abstract class Tester extends Developer{

    public void testCode(){

    }

    // 2 abstract methods
    // public abstract void releseCode();
    // public abstract void maintainCode();


}

abstract class DevOps extends Tester{
 
    public  void releseCode(){

    }
    // 1 abstract methods
    // public abstract void maintainCode();


}
class ProdSupport extends DevOps{

    public void maintainCode(){

    }

    // No abstract methods

}

class AbstarctDemo2{

    public static void main(String[] args) {

        //Cannot create objects from other classes since they are abstarct classes
        ProdSupport p = new ProdSupport();

        p.maintainCode();


    }

}







