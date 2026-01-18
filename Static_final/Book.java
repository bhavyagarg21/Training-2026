public class Book {
    String title;
    String author;
    final String isbn;

    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    static String libraryName="ABC library";

    static void displayLibraryName(){
        System.out.println(libraryName);
    }
    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Library name: "+libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
        else System.out.println("Not a Book object");
    }

    public static void main(String[] args){
        Book.displayLibraryName();
        
        Book b1=new Book("1984", "George Orwell", "978-0451524935");
        b1.displayDetails();
    }
}
