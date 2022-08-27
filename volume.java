import java.util.Scanner;

class volume {
    void geometery() {
        double l, b, h, r, pi, v;
        pi = 22 / 7.0;
        int a;
        Scanner in = new Scanner(System.in);
        System.out
                .println("Press 1 for Volume of Cuboid \nPress 2 for Volume of Cylinder \nPress 3 for Volume of Cone");
        System.out.println("Enter your choice");
        a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the length");
                l = in.nextDouble();
                System.out.println("Enter the breadth");
                b = in.nextDouble();
                System.out.println("Enter the height");
                h = in.nextDouble();
                v = l * b * h;
                System.out.println("Volume of the cuboid = " + v);
                break;
            case 2:
                System.out.println("Enter the radius");
                r = in.nextDouble();
                System.out.println("Enter the height");
                h = in.nextDouble();
                v = pi * (Math.pow(r, 2)) * h;
                System.out.println("Volume of the Cylinder = " + v);
                break;
            case 3:
                System.out.println("Enter the radius");
                r = in.nextDouble();
                System.out.println("Enter the height");
                h = in.nextDouble();
                v = 1 / 3.0 * pi * (Math.pow(r, 2)) * h;
                System.out.println("Volume of the Cone = " + v);
                break;
            default:
                System.out.println("Invalid Input");
        }
        in.close();
    }
}