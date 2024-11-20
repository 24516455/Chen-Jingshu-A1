// Appointment 类
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        doctor.printDetails();
    }
}
