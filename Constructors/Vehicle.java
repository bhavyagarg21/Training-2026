public class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }

    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Riya", "Bike");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);
        v2.displayVehicleDetails();
    }
}
