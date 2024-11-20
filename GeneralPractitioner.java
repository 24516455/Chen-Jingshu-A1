// GeneralPractitioner 类
public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner(int id, String name, String professionType, String specialty) {
        super(id, name, professionType);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
