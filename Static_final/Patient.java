public class Patient {
    final int patientID;
    String name;
    int age;
    String ailment;

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    private static int nextID = 1;

    Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = nextID;
        nextID++;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Not a Patient object");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Flu");
        
        p1.displayDetails();
        Patient.getTotalPatients();
    }
}
