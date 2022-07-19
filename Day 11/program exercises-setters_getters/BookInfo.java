class Book{

    // private variables
    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    //Setters
    public void setBookName(String bookName){

        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor){

        this.bookAuthor = bookAuthor;
    }

    public void setBookPrice(double bookPrice){

        this.bookPrice = bookPrice;
    }

    //getters
    public String getBookName(){

        return this.bookName;
    }

    public String getBookAuthor(){

        return this.bookAuthor;
    }

    public double getBookPrice(){

        return this.bookPrice;
    }

}

public class BookInfo{

 public static void main(String[] args){

     Book b1 = new Book();
     Book b2 = new Book();
     Book b3 = new Book();

     b1.setBookName("Oliver Twist");
     b1.setBookAuthor("Charles");
     b1.setBookPrice(2000);
    
     b2.setBookName("Oliver Twist2");
     b2.setBookAuthor("Dickon");
     b2.setBookPrice(15.50);

     b3.setBookName("Oliver Twist3");
     b3.setBookAuthor("Tom");
     b3.setBookPrice(1500);


     Book[] books = {b1,b2,b3};


     for(Book b : books){

        System.out.println(b.getBookName());
        System.out.println(b.getBookAuthor());
        System.out.println(b.getBookPrice());

     }


    }



 }



