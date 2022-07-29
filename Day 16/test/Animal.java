
//Starting of Animal Class
public abstract class Animal implements Comparable<Animal>{

     private String animalName;

     private int animalAge;

     //paramaterized constructor
     public Animal(String animalName, int animalAge){

             this.animalName = animalName;
             this.animalAge = animalAge;

     }

     //setters
     public void setAnimalName(String animalName){

        this.animalName = animalName;

     }

     public void setAnimalAge(int animalAge){
        
        this.animalAge = animalAge;

     }

     //getters
     public String getAnimalName(){

        return this.animalName;
     }

     public int getAnimalAge(){

        return this.animalAge;
     }

     //toString
     @Override
     public String toString(){

        return "Animal Name is : " + this.animalName + " , Animal Age is : " + this.animalAge;

     }

     

    //adding abstract methods

    public abstract String sayHello();
    public abstract String move(); 

    //CompareTo method
    @Override
    public int compareTo(Animal animals){

        if (this.getAnimalAge() == animals.getAnimalAge()){

            return 0;
        }
     
       else if(this.getAnimalAge() > animals.getAnimalAge()){

            return 1;

        }

        else{

            return -1;
        }

    }



}