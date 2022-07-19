class Book{

    String bookName;
    String bookAuthor;
    double bookPrice;

 public static void main(String[] args){

     Book b1 = new Book();
     Book b2 = new Book();
     Book b3 = new Book();


     b1.bookName = "Oliver Twist";
     b1.bookAuthor = "Charles";
     b1.bookPrice = 500;

     b2.bookName = "King Richard";
     b2.bookAuthor = "William";
     b2.bookPrice = 1000;

     b3.bookName = "white fang";
     b3.bookAuthor = "jack";
     b3.bookPrice = 560;


     Book[] books = {b1,b2,b3};


     for(Book b : books){

        System.out.println(b.bookName);
        System.out.println(b.bookAuthor);
        System.out.println(b.bookPrice);

     }








 }



}