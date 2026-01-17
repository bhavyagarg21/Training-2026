public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.costPerDay=200;
    }
    double totalCost(){
        return rentalDays*costPerDay;
    }
    public static void main(String[] args){
        CarRental c1=new CarRental("abc", "swift", 5);
        System.out.println("Total cost: "+ c1.totalCost());
    }
}
