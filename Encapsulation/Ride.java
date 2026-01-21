import java.util.ArrayList;

interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

abstract class Ride {

    private int RideId;
    private String driverName;
    private double ratePerKm;

    private String currentLocation;

    Ride(int RideId, String driverName, double ratePerKm) {
        this.RideId = RideId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    abstract double calculateFare(double distance);

    void getRideDetails() {
        System.out.println("Ride ID: " + RideId);
        System.out.println("Driver: " + driverName);
    }
    public static void main(String[] args) {

        ArrayList<Ride> vehicles = new ArrayList<>();

        vehicles.add(new Car(1, "Amit", 15));
        vehicles.add(new Bike(2, "Rohit", 8));
        vehicles.add(new Auto(3, "Suresh", 10));

        double distance = 10; 
        for (Ride v : vehicles) {
            v.getRideDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));

            GPS g = (GPS) v;
            g.updateLocation("City Center");
            g.getCurrentLocation();
        }
    }
}

class Car extends Ride implements GPS {

    Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Car location fetched");
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Car location updated to " + location);
    }
}

class Bike extends Ride implements GPS {

    Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance; 
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Bike location fetched");
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Bike location updated to " + location);
    }
}

class Auto extends Ride implements GPS {

    Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; 
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Auto location fetched");
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Auto location updated to " + location);
    }
}
