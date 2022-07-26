
public class InterfaceDemo1{
  
    public static void main(String[] args){

        SciCalc s = new SciCalc();

       // System.out.println(s.sum(20,30)); // instead of using this we can create function to process the operation

        StandardCalc st = new StandardCalc();

       // System.out.println(st.mul(200,300));

       Print(ProcessOp(s));
       Print(ProcessOp(st));

    }

    //Polymophisam
    public static int ProcessOp(MathOperation op){

        return op.sum(10, 10);

    }

    public static void Print(int result){

        System.out.println(result);
    }
}