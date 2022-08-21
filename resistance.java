import java.util.Scanner;

public class resistance {
    void seriesParallel() {
        double r1, r2, R1, R2;
        char n;
        Scanner in = new Scanner(System.in);
        System.out.println("Press S for series \nPress P for parallel");
        System.out.println("Enter your choice");
        n = in.next().charAt(0);
        switch(n){
            case 'S':
            System.out.println("Enter the value of r1");
            r1 = in.nextDouble();
            System.out.println("Enter the value of r2");
            r2 = in.nextDouble();
            R1 = r1 + r2;
            System.out.println("R1 = "+R1);
            break;
            case 'P':
            System.out.println("Enter the value of r1");
            r1 = in.nextDouble();
            System.out.println("Enter the value of r2");
            r2 = in.nextDouble();
            R2 = (r1 * r2)/(r1 + r2);
            System.out.println("R2 = "+R2);
            break;
            default :
            System.out.println("Invalid Input");
        }
        in.close();
    }
}
