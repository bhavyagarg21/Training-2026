class BorrowBook{
    String title;
    String author;
    double price;
    boolean available;
    BorrowBook(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.available=true;
    }
    void borrowBook(){
        if(available){
            available=false;
            System.out.println("book can be borrowed");
        }
        else System.out.println("book can't be borrowed");
    }
    public static void main(String[] args){
        BorrowBook b1=new BorrowBook("abc", "xyz", 220);
        b1.borrowBook();
    }
}