
//Super-Calss
abstract class Animal{

public abstract void sound();

}

//Sub-class Dog
class Dog extends Animal{

public void sound(){

    System.out.println("Woof");

  }

}

//Sub-class Cat
class Cat extends Animal{

    public void sound(){

        System.out.println("Meeow");
    
    
    }
}

//Main method
class AbstarctDemo1{

    public static void main(String[] args) {


        //Animal a1 = new Animal();//cannot create object from super class

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        //A super-class reference can refer to all of its subclass objects
        Animal ref = new Dog();
        ref.sound();

        ref = new Cat();
        ref.sound();

        soundLikeAnimal(new Dog());
        soundLikeAnimal(new Cat());

        soundLikeAnimal(ref); // gives the latest ref value which is "Meow"

    }
        //just wasting memory
        public static void soundLikeDog(Dog d) {

            d.sound();
            
        }
         //just wasting memory
        public static void soundLikeCat(Cat c) {

            c.sound();
            
        }

        //polymophisam (we can write both behaviours in a function)
        public static void soundLikeAnimal(Animal a) {

            a.sound();
            
        }


}


