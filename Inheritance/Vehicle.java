public class Vehicle {
    double maxSpeed;
    String fuelType;
    Vehicle(double maxSpeed, String fuelType){
        this.fuelType=fuelType;
        this.maxSpeed=maxSpeed;
    }
    void displayInfo(){
        System.out.println("Max speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);
    }
    public static void main(String[] args){
        Vehicle[] v=new Vehicle[3];
        v[0]=new Car(300,"Diesel",5);
        v[1]=new Motorcycle(250, "Petrol", "black");
        v[2]=new Truck(180, "Diesel", 12000);

        for(Vehicle s:v){
            s.displayInfo();
        }
    }
}
class Truck extends Vehicle {
    int loadCapacity;
    Truck(double maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " kg");
    }
}

class Car extends Vehicle{
    int seatCapacity;
    Car(double maxSpeed, String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity: "+seatCapacity);
    }
}
class Motorcycle extends Vehicle{
    String color;
    Motorcycle(double maxSpeed, String fuelType, String color){
        super(maxSpeed, fuelType);
        this.color=color;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Color: "+color);
    }
}
