interface Refuelable{
    void refuel();
}
public class VehicleManagement {
    double maxSpeed;
    String model;
    VehicleManagement(double maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public static void main(String[] args){
        Refuelable r1=new PetrolVehicle(300, "A1058");
        r1.refuel();
    }
}
class ElectricVehicle extends VehicleManagement{
    ElectricVehicle(double maxSpeed,String model){
        super(maxSpeed, model);
    }
    void charge(){
        System.out.println("The vehicle can be recharged");
    }
}
class PetrolVehicle extends VehicleManagement implements Refuelable{
    PetrolVehicle(double maxSpeed,String model){
        super(maxSpeed, model);
    }
    @Override
    public void refuel(){
        System.out.println("The vehicle can be refueled");
    }
}
