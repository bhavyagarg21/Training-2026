public class Book {
    String title;
    int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Book title: "+title);
        System.out.println("Publication year: "+publicationYear);
    }
    public static void main(String[] args){
        Book b1=new Author("xyz",1985,"abc","The author of book xyz");
        b1.displayInfo();

    }
}
class Author extends Book{
    String name ;
    String bio;
    Author(String title,int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author name: "+name);
        System.out.println("Bio: "+bio);
    }
}
