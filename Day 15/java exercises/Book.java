import java.util.ArrayList;
import java.util.Iterator;

class Book{

    String bookName;
    String bookAuthor;
    double bookPrice;
    
    public Book(String bookName,String bookAuthor,double bookPrice){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor; 
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
      return "Book Name : " + this.bookName +  ", Book Author : " + this.bookAuthor+ ", Book Price : " + this.bookPrice;
    }

 public static void main(String[] args){

    ArrayList<Book> list = new ArrayList<Book>();
    
     Book b1 = new Book("Oliver Twist","Charles",500);
     Book b2 = new Book("King Richard","William",1000);
     Book b3 = new Book("white fang","jack",560);


     list.add(b1);
     list.add(b2);
     list.add(b3);

    //Printing list using println
     System.out.println(list);

   //Printing list using foreach loop
    for(Book bk : list){

        System.out.println(bk);
    }


    //Print list using iterator

    Iterator<Book> it = list.iterator();

    while (it.hasNext()){

        System.out.println(it.next());

    }

 }

}