public class Product {
    //instance variables
    String productName;
    double price;

    //class variables
    static int totalProducts=0;
    
    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
    }
    //instance method
    void displayProductDetails(){
        System.out.println("Product name: "+ productName);
        System.out.println("Price: "+price);
    }

    //class method
    static void displayTotalProducts(){
        System.out.println("Total products: " + totalProducts);
    }
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mobile", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.totalProducts=10;
        Product.displayTotalProducts();

    }
}
