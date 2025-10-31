import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has patients:");
        for (Patient p : patients)
            System.out.println("- " + p.name);
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare Hospital");

        Doctor d1 = new Doctor("Dr. Meera");
        Doctor d2 = new Doctor("Dr. Rahul");

        Patient p1 = new Patient("Riya");
        Patient p2 = new Patient("Arjun");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();
    }
}
