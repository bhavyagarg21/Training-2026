import java.util.*;
class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    void displayBook(){
        System.out.println(title+" by "+author);
    }
}
class Library{
    String libraryName;
    ArrayList<Book> list;

    Library(String libraryName){
        this.libraryName=libraryName;
        list=new ArrayList<>();
    }
    void addBook(Book b){
        list.add(b);
    }
    void showBooks(){
        System.out.println("Books in "+libraryName);
        for(Book b:list){
            b.displayBook();
        }
    }
    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); 

        lib1.showBooks();
        lib2.showBooks();
    }
}

