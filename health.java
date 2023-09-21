import java.util.ArrayList;
import java.util.List;

public class HealthcareManagementSystem {

    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HealthcareManagementSystem() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void scheduleAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public List<Patient> getPatients() {
        return this.patients;
    }

    public List<Doctor> getDoctors() {
        return this.doctors;
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    public static void main(String[] args) {
        HealthcareManagementSystem system = new HealthcareManagementSystem();

        // Add some patients and doctors to the system.
        Patient patient1 = new Patient("John Doe", 30);
        Patient patient2 = new Patient("Jane Doe", 25);
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Jones", "Orthopedics");
        system.addPatient(patient1);
        system.addPatient(patient2);
        system.addDoctor(doctor1);
        system.addDoctor(doctor2);

        // Schedule an appointment for patient1 with doctor1.
        Appointment appointment = new Appointment(patient1, doctor1, "2023-09-15T10:00:00Z");
        system.scheduleAppointment(appointment);

        // Get a list of all patients.
        List<Patient> patients = system.getPatients();

        // Print the names of all patients.
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

class Patient {

    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Doctor {

    private String name;
    private String specialty;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecialty() {
        return this.specialty;
    }
}

class Appointment {

    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateAndTime;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateAndTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateAndTime = dateAndTime;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public LocalDateTime getDateAndTime() {
        return this.dateAndTime;
    }
}
