package bloodbank;

public class BloodStock {

    private String bloodGroup;
    private int units;

    public BloodStock(String bloodGroup, int units) {
        this.bloodGroup = bloodGroup;
        this.units = units;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getUnits() {
        return units;
    }

    public void addUnits(int units) {
        this.units += units;
    }

    public void display() {
        System.out.println(bloodGroup + " : " + units + " Units");
    }
}