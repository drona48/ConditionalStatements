import java.util.Scanner;

public class interest {
    void si() {
        double si, ci, p, r, t;
        char n;
        Scanner in = new Scanner(System.in);
        System.out.println("Press S for SI \nPress C for CI");
        n = in.next().charAt(0);
        switch (n) {
            case 'S':
                System.out.println("Enter the principle");
                p = in.nextDouble();
                System.out.println("Enter the rate");
                r = in.nextDouble();
                System.out.println("Enter the time");
                t = in.nextDouble();
                si = p * r * t / 100.0;
                System.out.println("SI = " + si);
                break;
            case 'C':
                System.out.println("Enter the principle");
                p = in.nextDouble();
                System.out.println("Enter the rate");
                r = in.nextDouble();
                System.out.println("Enter the time");
                t = in.nextDouble();
                ci = p * (Math.pow((1 + r / 100.0), t) - 1);
                System.out.println("CI = " + ci);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        in.close();
    }
}
