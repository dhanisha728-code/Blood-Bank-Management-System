package bloodbank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BloodBank bank = new BloodBank();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" 🩸 BLOOD BANK MANAGEMENT SYSTEM 🩸");
            System.out.println("======================================");
            System.out.println("1. ➕ Add Donor");
            System.out.println("2. 👨 View Donors");
            System.out.println("3. 🔍 Search Donor");
            System.out.println("4. 🩸 Add Blood Stock");
            System.out.println("5. 📦 View Blood Stock");
            System.out.println("6. 📊 Reports");
            System.out.println("7. 🚪 Exit");
            System.out.println("======================================");
            System.out.print("👉 Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Donor ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Blood Group : ");
                    String group = sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String phone = sc.nextLine();

                    Donor donor = new Donor(id, name, age, group, phone);
                    bank.addDonor(donor);

                    break;

                case 2:

                    bank.viewDonors();

                    break;

                case 3:

                    System.out.print("Enter Blood Group : ");
                    String search = sc.nextLine();

                    bank.searchDonor(search);

                    break;

                case 4:

                    System.out.print("Enter Blood Group : ");
                    String bg = sc.nextLine();

                    System.out.print("Enter Units : ");
                    int units = sc.nextInt();

                    bank.addBloodStock(bg, units);

                    break;

                case 5:

                    bank.viewBloodStock();

                    break;

                case 6:

                    bank.reports();

                    break;

                case 7:

                    System.out.println("\n🙏 Thank You for Using");
                    System.out.println("🩸 Blood Bank Management System");
                    System.out.println("Have a Nice Day!");

                    break;

                default:

                    System.out.println("❌ Invalid Choice!");

            }

        } while (choice != 7);

        sc.close();
    }
}