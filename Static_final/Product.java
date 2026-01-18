public class Product {
    final int productID;

    String productName;
    double price;
    int quantity;

    static double discount = 0.0;

    private static int nextID = 1;

    Product(String productName, double price, int quantity) {
        this.productName = productName;  
        this.price = price;
        this.quantity = quantity;
        this.productID = nextID;  
        nextID++;  
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Not a Product object");
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0, 2);

        p1.displayDetails();

        Product.updateDiscount(10.0);
        p1.displayDetails();
      
    }
}
