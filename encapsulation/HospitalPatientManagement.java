
import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> records = new ArrayList<>();

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void addRecordEntry(String entry) { records.add(entry); }
    public void viewRecords() { System.out.println("Records for " + name + ": " + records); }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String entry);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private double dailyRoomCharge;

    public InPatient(String id, String name, int age, int days, double dailyRoomCharge) {
        super(id, name, age);
        this.days = days;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    @Override
    public double calculateBill() {
        return days * dailyRoomCharge + 2000; // other charges
    }

    @Override
    public void addRecord(String entry) { addRecordEntry(entry); }

    @Override
    public void viewRecords() { super.viewRecords(); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String entry) { addRecordEntry(entry); }

    @Override
    public void viewRecords() { super.viewRecords(); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient ip = new InPatient("P001", "Riya", 30, 4, 3000);
        OutPatient op = new OutPatient("P002", "Aman", 25, 500);

        patients.add(ip);
        patients.add(op);

        ip.addRecord("Appendectomy performed");
        op.addRecord("Consultation - fever");

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            p.viewRecords();
            System.out.println();
        }
    }
}
