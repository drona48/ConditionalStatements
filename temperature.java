import java.util.Scanner;

public class temperature {
    void temp() {
        double f, c;
        char n;
        Scanner in = new Scanner(System.in);
        System.out.println("Press C for Farenheit to Celsius Scale \nPress F for Celsius to Farenheit Scale");
        System.out.println("Enter your choice");
        n = in.next().charAt(0);
        switch (n) {
            case 'C':
            case 'c':
                System.out.println("Enter the temperature");
                f = in.nextDouble();
                c = 5 / 9.0 * (f - 32);
                System.out.println("The temperature is = " + c + "degree Celsius");
                break;
            case 'F':
            case 'f':
                System.out.println("Enter the temperature");
                c = in.nextDouble();
                f = 1.8 * c + 32;
                System.out.println("The temperature is = " + f + "degree Farenheit");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        in.close();
    }
}
