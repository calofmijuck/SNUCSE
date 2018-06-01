import java.util.Scanner;

public class Lab02_ASCIIArt {

    public static void main(String[] args) {
        System.out.println("집에 가고 싶다!");
        System.out.println("loop count: " + to_do(scan_example()));
    }

    public static int to_do(int num) {
        topline(num);
        middle(num);
        topline(num);
        return 1;
    }
    public static void topline(int num) {
        System.out.print("#");
        for (int i = 0; i < 4 * num; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void middle(int num) {
        for (int i = 0; i <  num; i++) {
            System.out.print("|");
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            for (int j = 1; j < i + 1; j++) {
                System.out.print("....");
            }
            System.out.print("<>");
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            System.out.println("|");
        }
        for (int i = num - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            System.out.print("<>");
            for (int j = 1; j < i + 1; j++) {
                System.out.print("....");
            }
            System.out.print("<>");
            for (int j = 1; j < num - i; j++) {
                System.out.print("  ");
            }
            System.out.println("|");
        }
    }


    public static int scan_example() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type int: ");
        //int read = scan.nextInt();
        int read = Integer.parseInt(scan.nextLine());

        return read;
    }

}
