class conditions6{

    public static void main(String[] args){
        
        int today = 2022;

        for (int year= 1900;year <=today;year++){
        int x = year % 4;
        int y = year % 100;
        int z = year % 400;
            
            if (x==0 && y!=0 || z==0){

                System.out.println(year +" is a leap year");
            }
            else{

                System.out.println(year +" is not a leap year");
            }
          

        }


        

        }
        
  
     }
  
  
  