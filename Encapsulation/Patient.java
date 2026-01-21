import java.util.ArrayList;

interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    private String diagnosis;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
    }
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Ravi", 45, 5));
        patients.add(new OutPatient(102, "Anita", 30, 3));

        for (Patient p : patients) {
            p.getPatientDetails();

            MedicalRecord m = (MedicalRecord) p;
            m.addRecord("General Checkup");
            m.viewRecords();
        }
    }
}

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;

    InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * 2000;  
    }

    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
        System.out.println("In-Patient record added");
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing In-Patient medical record");
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private int visits;

    OutPatient(int id, String name, int age, int visits) {
        super(id, name, age);
        this.visits = visits;
    }

    @Override
    double calculateBill() {
        return visits * 500;  
    }

    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
        System.out.println("Out-Patient record added");
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing Out-Patient medical record");
    }
}
