// HealthProfessional 基类
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String professionType;

    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.professionType = "";
    }

    public HealthProfessional(int id, String name, String professionType) {
        this.id = id;
        this.name = name;
        this.professionType = professionType;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Profession Type: " + professionType);
    }
}
