import java.util.ArrayList;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public String getType() {
        return type;
    }

    abstract double calculateRentalCost(int days);

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-02"));
        vehicles.add(new Truck("TRK303", 3000, "TRK-INS-03"));

        int days = 3;
        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = ((Insurable) v).calculateInsurance();

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
        }
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;   // fixed insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}

