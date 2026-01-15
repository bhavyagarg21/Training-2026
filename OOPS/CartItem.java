import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }
        quantity += qty;
        System.out.println("Item added to cart");
    }

    void removeItem(int qty) {
        if (qty <= 0) {
            System.out.println("Invalid quantity");
            return;
        }
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Item removed from cart");
        } else {
            System.out.println("Not enough items in cart");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        CartItem item = new CartItem(name, price);

        System.out.print("Enter quantity to add: ");
        int addQty = sc.nextInt();
        item.addItem(addQty);

        System.out.print("Enter quantity to remove: ");
        int removeQty = sc.nextInt();
        item.removeItem(removeQty);

        item.displayTotalCost();

        sc.close();
    }
}

