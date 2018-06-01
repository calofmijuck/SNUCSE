import java.util.Scanner;

public class Lab03_power2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Power2(n));


        }

    public static boolean Power2(int n) {
        int c = n & (n - 1);
        if(c == 0) {
            return true;
        }
        else{
            return false;
        }
    }


}
