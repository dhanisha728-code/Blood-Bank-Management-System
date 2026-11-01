package bloodbank;

public class Donor extends Person {

    private String bloodGroup;
    private String phone;

    public Donor(int id, String name, int age,
                 String bloodGroup, String phone) {

        super(id, name, age);
        this.bloodGroup = bloodGroup;
        this.phone = phone;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void display() {

        System.out.println("----------------------------");
        System.out.println("Donor ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Blood Group : " + bloodGroup);
        System.out.println("Phone : " + phone);
    }
}