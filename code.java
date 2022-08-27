import java.util.Scanner;

class Code {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Press 1 for Code 1 \nPress 2 for Code 2 \nPress 3 for Code 3 \nPress 4 for Code 4 \nPress 5 for Code 5 \nPress 6 for Code 6");
        System.out.println("Enter Choice");
        n = in.nextInt();
        switch (n) {
            case 1:
                discount obj1 = new discount();
                obj1.store();
                break;
            case 2:
                interest obj2 = new interest();
                obj2.si();
                break;
            case 3:
                resistance obj3 = new resistance();
                obj3.seriesParallel();
                break;
            case 4:
                mall obj4 = new mall();
                obj4.garmentStore();
                break;
            case 5:
                volume obj5 = new volume();
                obj5.geometery();
                break;
            case 6:
                temperature obj6 = new temperature();
                obj6.temp();
            default:
                System.out.println("Invalid Input");
        }
        in.close();
    }
}