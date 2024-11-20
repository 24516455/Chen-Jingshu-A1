import java.util.ArrayList;

// 主类 AssignmentOne
public class Main {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practitioner", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practitioner",
                "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "General Practitioner", "Pediatrics");

        Nurse nurse1 = new Nurse(4, "Nurse Emily", "Nurse", "Surgical Ward");
        Nurse nurse2 = new Nurse(5, "Nurse Lily", "Nurse", "Emergency");

        // 打印健康专业人员的详细信息
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        nurse1.printDetails();
        System.out.println("------------------------------");
        nurse2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建预约方法
        createAppointment(appointments, "John Doe", "123456789", "08:00", gp1);
        createAppointment(appointments, "Jane Doe", "987654321", "10:00", nurse1);
        createAppointment(appointments, "Mark Smith", "456123789", "14:00", gp2);
        createAppointment(appointments, "Mary Johnson", "321654987", "16:00", nurse2);

        // 打印现有预约
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // 取消预约
        cancelBooking(appointments, "987654321");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    // 创建预约
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile,
            String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
        appointments.add(appointment);
    }

    // 打印现有预约
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // 取消预约
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Appointment with mobile number " + patientMobile + " has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Appointment with mobile number " + patientMobile + " not found.");
        }
    }
}
