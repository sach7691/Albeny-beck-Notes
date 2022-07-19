class Book{

    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    //constructor
    public Book(String bookName,String bookAuthor,double bookPrice){

        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    //Getter Book Details

    public String getBookDetails() { 

        return "Book Name: \n " + this.bookName + "Car Model: \n " + this.bookAuthor + "Car Price: \n " + this.bookPrice;
    } 

    // public void getBookDetails() {

    //     System.out.println(this.bookName);
    //     System.out.println(this.bookAuthor);
    //     System.out.println(this.bookPrice);
    // }

    
}

public class BookInfo1{

 public static void main(String[] args){

     Book b1 = new Book("Oliver Twist","Charles",2000);
     Book b2 = new Book("Oliver Twist2","Dickon",15.50);
     Book b3 = new Book("Oliver Twist3","Tom",1500);


     Book[] books = {b1,b2,b3};


     for(Book b : books){

       // b.getBookDetails();

       System.out.println(b.getBookDetails());
      

     }




    }



 }



