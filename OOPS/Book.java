import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

        Book(String title, String author, double price){
            this.title=title;
            this.price=price;
            this.author=author;
        }

        void display(){
            System.out.println("Title: "+ title);
            System.out.println("Author: "+ author);
            System.out.println("Price: "+ price);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter title: ");
            String title=sc.nextLine();

            System.out.println("Enter author: ");
            String author=sc.nextLine();


            System.out.println("Enter price: ");
            double price=sc.nextDouble();

            Book b1=new Book(title,author,price);
            b1.display();
            sc.close();
        }
}
