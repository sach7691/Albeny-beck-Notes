class Animal{

public abstract void sound();

}

class Dog extends Animal{

public void sound(){

    System.out.println("Woof");


}

}

class Cat extends Animal{

    public void sound(){

        System.out.println("Meeow");
    
    
    }


class AbstarctDemo1{

    public static void main(String[] args) {


        Animal a1 = new Animal();//cannot create object from super class

        Dog d1 = new Dog();

        d1.sound();
        
    }




}


}