class AnonymousInner{

 public static void main (String[] args){


        //FileStorage fs = new FileStorage();

        //fs.store();

        Storage str1 = new Storage(){

            public void store(){


                System.out.println("Store V1");
            }


        };

        Storage str2 = new Storage(){

            public void store(){


                System.out.println("Store V2");
            }


        };

        str1.store();
        str2.store();


 }


}