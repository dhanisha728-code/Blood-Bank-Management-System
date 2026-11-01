package bloodbank;

import java.util.ArrayList;

public class BloodBank {

    ArrayList<Donor> donors = new ArrayList<>();
    ArrayList<BloodStock> stocks = new ArrayList<>();

    // Add Donor
    public void addDonor(Donor donor) {
        donors.add(donor);
        System.out.println("✅ Donor Added Successfully.");
    }

    // View Donors
    public void viewDonors() {

        if (donors.isEmpty()) {
            System.out.println("No Donors Available.");
            return;
        }

        for (Donor d : donors) {
            d.display();
        }
    }

    // Search Donor
    public void searchDonor(String group) {

        boolean found = false;

        for (Donor d : donors) {

            if (d.getBloodGroup().equalsIgnoreCase(group)) {
                d.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Donor Found.");
        }
    }

    // Add Blood Stock
    public void addBloodStock(String group, int units) {

        for (BloodStock stock : stocks) {

            if (stock.getBloodGroup().equalsIgnoreCase(group)) {

                stock.addUnits(units);
                System.out.println("Blood Stock Updated Successfully.");
                return;
            }
        }

        stocks.add(new BloodStock(group, units));
        System.out.println("Blood Stock Added Successfully.");
    }

    // View Blood Stock
    public void viewBloodStock() {

        if (stocks.isEmpty()) {
            System.out.println("No Blood Stock Available.");
            return;
        }

        System.out.println("\n===== BLOOD STOCK =====");

        for (BloodStock stock : stocks) {
            stock.display();
        }
    }

    // Reports
    public void reports() {

        System.out.println("\n======= REPORT =======");
        System.out.println("Total Donors : " + donors.size());
        System.out.println("Blood Groups : " + stocks.size());
        System.out.println("======================");
    }
}