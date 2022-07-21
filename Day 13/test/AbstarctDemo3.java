import java.lang.*;

//Point Class is a helper class
 class Point{

 private double x;
 private double y;

//Constructor
 public Point(double x,double y){

    this.x = x;
    this.y = y;
 }

 //Setters
 public void setX(double x){

    this.x = x;
 }

 public void setY(double y){

    this.y = y;
 }

 //Getters
 public double getX(){

    return this.x;
 }

 public double getY(){

     return this.y;
 }

 //ToString
 public String toString(){

    return "x value is : " + this.x + ",  y value is : " + this.y;

   }

}

//Class Shape - Parent class -------------------------------------------------------

abstract class Shape{

    private String name;
    private String colour;
    private double shapeX;
    private double shapeY;

    //abstract methods
    public abstract double getArea();
    public abstract Point getCenterPoint();

//Shape Constructor
    public Shape(String name,String colour,double shapeX,double shapeY){
    
        this.name = name;
        this.colour = colour;
        this.shapeX = shapeX;
        this.shapeY = shapeY;

    }

//Setters
    public void setName(String name){
     
         this.name = name;
         

    }
    public void setColour(String colour){

        this.colour = colour;
    }
    public void setShapeX(double shapeX){

        this.shapeX = shapeX;
    }

    public void setShapeY(double shapeY){

        this.shapeY= shapeY;
    }

//Getters

     public String getName(){

        return this.name;
     }

     public String getColour(){

        return this.colour;
     }
     public double getShapeX(){

        return this.shapeX;
    }

    public double getShapeY(){

        return this.shapeY;
    }

     public String toString(){

        return "Name is : " + this.name + " Colour is : " + this.colour + " " + " X is : " + this.shapeX + " Y is : " + this.shapeY ;
     }

}

//Rectangle Class: sub-class of Shape--------------------------------------------------

class Rectangle extends Shape{

    private double height;
    private double width;

//Constructor
    public Rectangle(String name,String colour,double shapeX,double shapeY,double height,double width){

        super(name,colour,shapeX,shapeY);
        this.height = height;
        this.width = width;
    }

//isSquare Method
    public boolean isSquare(){

    if(height == width){
        
        return true;

    }
    else{

        return false;
    }
    
}

//Setters
    public void setHeight(double height){

        this.height = height;
    }

    public void setWidth(double width){

        this.width = width;
    }

//Getters

    public double getHeight(){

        return this.height;
    }

    public double getWidth(){

        return this.width;
    }

    public String toString(){

        return super.toString() + "  Height is : " + this.height + "  Width is : " + this.width;

    }

//Override the abstract methods from Shape Class

    public double getArea(){

        return  (this.height) * (this.width);


    }

    public Point getCenterPoint(){
      
         double w = (super.getShapeX()+ this.width)/2;
         double z = (super.getShapeY()+ this.height)/2;
         Point p = new Point(w,z);

          return p;
     }

}


//Circle sub-class-------------------------------------------------------------------------------------------------------
class Circle extends Shape{

    private double radius;

    //Constructor
    public Circle(String name,String colour,double shapeX,double shapeY, double radius){

        super(name, colour, shapeX, shapeY);
        this.radius = radius;
    }

    //Setter
    public void setRadius(double radius){

        this.radius = radius;
    }

    //Getters
    public double getRadius(){

        return radius;
    }

    public String toString(){

        return super.toString() + "  " + "Radius is : " + this.radius;
    }

    //Override the abstract methods from Shape Class

    public double getArea(){

        return  Math.PI * Math.pow(radius, 2);
    }

    public Point getCenterPoint(){
      
        double  u = super.getShapeX() * Math.sqrt(this.radius - (super.getShapeY()* super.getShapeY())/2);
        double  v = super.getShapeY() * Math.sqrt(this.radius - (super.getShapeX() * super.getShapeX())/2);
        
        
        Point p1 = new Point(u,v);

         return p1;
    }
    
}


// Main Program

class AbstarctDemo3{


    public static void main(String[] args){

    //Rectangle Objects

        Rectangle r1 = new Rectangle("R1","Red",2,2,8,5);
        Rectangle r2 = new Rectangle("R2","Blue",4,6,7,8);
        Rectangle r3 = new Rectangle("R3","Green",5,1,7,7);

        Rectangle[] rectangles = {r1,r2,r3};

         for(Rectangle r: rectangles){

             System.out.println(r.toString());
             System.out.println(r.getCenterPoint());
             System.out.println("Area is : " + r.getArea());
             System.out.println("Is Square : " + r.isSquare());
             System.out.println();

             
         }

        //Circle Objects
         Circle c1 = new Circle("C1", "Black", 2, 1, 3);
         Circle c2 = new Circle("C2", "White", 5, 5, 5);
         Circle c3 = new Circle("C3", "Yellow", 4, 4, 4);

         Circle[] circles = {c1,c2,c3};

         for(Circle cr : circles){

             System.out.println(cr.toString());
             System.out.println("Area is : " + Math.round(cr.getArea()));
             System.out.println(cr.getCenterPoint());
             System.out.println();

         }
        
    }
}






