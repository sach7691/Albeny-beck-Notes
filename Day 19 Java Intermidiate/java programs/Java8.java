class Java8{

    public static void main (String[] args){
   
   
           //FileStorage fs = new FileStorage();
   
           //fs.store();

           Storage str1 = () -> {System.out.println("Store V1");};
           Storage str2 = () -> {System.out.println("Store V2");};
        
   
           str1.store();
           str2.store();
   
   
    }
   
   
   }