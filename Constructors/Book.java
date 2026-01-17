class Book{
        String title;
        String author;
        double price;
        Book(){
            System.out.println("default constructor called");
        }
        Book(String title, String author, double price){
            System.out.println("parameterized constructor called");
            this.title=title;
            this.author=author;
            this.price=price;
        }
        public static void main(String[] args){
            Book b1=new Book();
            Book b2=new Book("abc","xyz",250);
        }
    }
