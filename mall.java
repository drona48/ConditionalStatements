import java.util.Scanner;

public class mall {
    void garmentStore() {
        int n;
        double totalAmount;
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Press 0 for Ground Floor \nPress 1 for First Floor \nPress 2 for Second Floor \nPress 3 for Third Floor");
        System.out.println("Enter your choice");
        n = in.nextInt();
        switch (n) {
            case 0:
                System.out.println("Kid's Wear");
                break;
            case 1:
                System.out.println("Ladies Wear");
                break;
            case 2:
                System.out.println("Designer Sarees");
                break;
            case 3:
                System.out.println("Men's Wear");
                break;
        }
        System.out.println("Enter The Total Amount");
        totalAmount = in.nextDouble();
        System.out.println("Name of the Shop : City Mart \nTotal Amount : " + totalAmount + "\nVisit Again!!!!");
        in.close();
    }
}
