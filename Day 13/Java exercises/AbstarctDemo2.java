


//MULTI-LEVEL INHERITANCE
abstract class Person{

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

    // public abstract void developCode();
    // public abstract void testCode();
    // public abstract void releseCode();
    // public abstract void maintainCode();

}

abstract class Developer extends BA{

    //this class can override developCode in BA 
 public void developCode(){

 }
    // public abstract void testCode();
    // public abstract void releseCode();
    // public abstract void maintainCode();


}

abstract class Tester extends Developer{

    public void testCode(){

    }
    // public abstract void releseCode();
    // public abstract void maintainCode();


}

abstract class DevOps extends Tester{
 
    public  void releseCode(){

    }

    // public abstract void maintainCode();


}
class ProdSupport extends DevOps{

    public void maintainCode(){

    }

}

class AbstarctDemo2{

    public static void main(String[] args) {

        //Cannot create objects from other classes since they are abstarct classes
        ProdSupport p = new ProdSupport();

        p.maintainCode();


    }

}







