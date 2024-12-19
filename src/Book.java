import java.io.UncheckedIOException;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    String barcode;

    public Book(){

    }
    public Book(String title){
        this.title = title;
    }

    public Book(String author, double price){
        this.author =author;
        this.price =price;
    }

    public Book(String title, String author, double price, String barcode){
        this.title = title;
        this.author = author;
        this.price = price;
        this.barcode = barcode;



    }

    public void displayDetail(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the title of the book:");
        title = scanner.nextLine();
        System.out.print("Enter the author name: ");
        author = scanner.next();
        try {
            if(title.equals("Grow Rich")){
//            System.out.print("Enter the author name: ");
//            author =  scanner.nextLine();
                barcode = "001";
                price = 12;
                System.out.println("The " + title +" book " + barcode + " is " + price + "$");
            }
        } catch (UnknownError e){
                e.addSuppressed(new Throwable("Congrats you have error"));
        }
    }
}
