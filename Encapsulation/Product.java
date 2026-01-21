import java.util.ArrayList;

interface taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product {
    private String productId;
    private String name;
    private double price;
    Product(String productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
    void setPrice(double newPrice){
        price=newPrice;
    }
    
    String getName(){
        return name;
    }
    abstract double calculateDiscount();
    public static void main(String[] args){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Electronics("E1", "Laptop", 60000));
        list.add(new Clothing("C1", "Shirt", 3000));
        list.add(new Groceries("G1", "Rice", 1200));

        for (Product p : list) {
            double tax = (p instanceof taxable)
                    ? ((taxable) p).calculateTax()
                    : 0;

            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
class Electronics extends Product implements taxable {

    Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

class Groceries extends Product {

    Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
class Clothing extends Product implements taxable {

    Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}
