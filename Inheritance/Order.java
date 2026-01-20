import java.time.LocalDate;
public class Order {
    int orderId;
    LocalDate orderDate;
    Order(int orderId,LocalDate orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus(){
        return"Order placed";
    }
    public static void main(String[] args){
        Order o1=new Order(101,LocalDate.of(2005,5,22));
        Order o2 = new ShippedOrder(102, LocalDate.of(2025, 1, 11), "TRK123");
        Order o3 = new DeliveredOrder(
                103,
                LocalDate.of(2025, 1, 12),
                "TRK456",
                LocalDate.of(2025, 1, 15)
        );

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(int orderId,LocalDate orderDate,String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus(){
        return"Order shipped";
    }
}

class DeliveredOrder extends ShippedOrder{
    LocalDate deliveryDate; 
    DeliveredOrder(int orderId,LocalDate orderDate,String trackingNumber,LocalDate deliveryDate){
        super(orderId, orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return"Order delivered";
    }
}
