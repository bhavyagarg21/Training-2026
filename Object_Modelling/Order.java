import java.util.ArrayList;

class Order {
    String orderId;
    ArrayList<Product> products;  

    Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }


    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 800);
        Product p2 = new Product("P102", "Mouse", 20);

        Order order1 = new Order("O201");
        order1.addProduct(p1);
        order1.addProduct(p2);

        Customer customer = new Customer("C301", "Alice");
        customer.placeOrder(order1);

        System.out.println(customer.name + " placed order " + order1.orderId + " with products:");
        for (Product p : order1.products) {
            System.out.println("- " + p.productName + " (" + p.price + ")");
        }
    }


}
class Product {
    String productId;
    String productName;
    double price;

    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}


class Customer {
    String customerId;
    String name;
    ArrayList<Order> orders;  

    Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order order) {
        orders.add(order);
    }
}

