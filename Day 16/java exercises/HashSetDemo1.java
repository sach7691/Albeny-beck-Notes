import java.util.HashSet;

public class HashSetDemo1{

    public static void main(String[] args){

   HashSet<String> names = new HashSet<>();
   
   
   names.add("Peter");
   names.add("Austin");
   names.add("Noon");
    
   //Unordered set will print according to internal hash codes
   System.out.println(names);

   //to get the has code

   System.out.println("Noon".hashCode());
   System.out.println("Peter".hashCode());


    }

}