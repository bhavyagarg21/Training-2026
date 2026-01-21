import java.util.ArrayList;

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
    public static void main(String[] args) {

        ArrayList<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("abc", 250, 2));
        order.add(new NonVegItem("xyz", 180, 1));
        for (FoodItem item : order) {
            item.getItemDetails();

            Discountable d = (Discountable) item;
            d.getDiscountDetails();
            System.out.println("Discount Amount: " + d.applyDiscount());
        }
    }
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;   
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Veg Item Discount: 10%");
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    double calculateTotalPrice() {
        double extraCharge = 50;   
        return (getPrice() * getQuantity()) + extraCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;   
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount: 5%");
    }
}
