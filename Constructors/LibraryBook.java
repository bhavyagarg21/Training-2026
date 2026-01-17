class LibraryBook {
    public String ISBN;
    protected String title;
    private String author;

    LibraryBook(String ISBN,String title){
        this.title=title;
        this.ISBN=ISBN;
    }
    void setAuthor(String author){
        this.author=author;
    }
    String getAuthor(){
        return author;
    }
    public static void main(String[] args){
        LibraryBook lb=new LibraryBook("123-456", "Java Programming");
        lb.setAuthor("Alice");

        System.out.println("Author: " + lb.getAuthor());
        System.out.println("ISBN: " + lb.ISBN);  
        System.out.println( lb.title);  

        EBook eb = new EBook("789-101", "Data Structures");
        System.out.println("EBook ISBN: " + eb.getISBN());  
        System.out.println("EBook Title: " + eb.getTitle());
    }
}
class EBook extends LibraryBook{
    EBook(String ISBN,String title){
        super(ISBN, title);
    }
    String getISBN(){
        return ISBN;
    }
    String getTitle(){
        return title;
    }
    
}
