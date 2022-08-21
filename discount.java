import java.util.Scanner;

public class discount {
    void store() {
        Scanner dis = new Scanner(System.in);
        double netAmount = 0.0D;
        double amount, disc;
        String name;
        System.out.println("Enter your name");
        name = dis.nextLine();
        char s;
        System.out.println("Press 'L' for Laptop \nPress 'D' for Desktop");
        System.out.println("Enter your choice");
        s = dis.next().charAt(0);

        switch (s) {

            case 'L':
                System.out.println("Enter the Amount");
                amount = dis.nextDouble();
                if (amount <= 25000) {
                    disc = 0.0;
                    netAmount = amount - (disc / 100.0) * amount;
                } else if (amount <= 50000) {
                    disc = 5.0;
                    netAmount = amount - (disc / 100.0) * amount;
                } else if (amount <= 100000) {
                    disc = 7.5;
                    netAmount = amount - (disc / 100.0) * amount;
                } else {
                    disc = 10.0;
                    netAmount = amount - (disc / 100.0) * amount;
                }
                break;
            case 'D':
                System.out.println("Enter the Amount");
                amount = dis.nextDouble();
                if (amount <= 25000) {
                    disc = 5.0;
                    netAmount = amount - (disc / 100.0) * amount;
                } else if (amount <= 50000) {
                    disc = 7.5;
                    netAmount = amount - (disc / 100.0) * amount;
                } else if (amount <= 100000) {
                    disc = 10.0;
                    netAmount = amount - (disc / 100.0) * amount;
                } else {
                    disc = 15.0;
                    netAmount = amount - (disc / 100.0) * amount;
                }
                break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println("Name =" + name);
        System.out.println("The Amount to be purchased = " + netAmount);
        dis.close();
    }
}
