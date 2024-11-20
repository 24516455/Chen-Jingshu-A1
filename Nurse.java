// Nurse 类
public class Nurse extends HealthProfessional {
    private String ward;

    public Nurse(int id, String name, String professionType, String ward) {
        super(id, name, professionType);
        this.ward = ward;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Ward: " + ward);
    }
}
