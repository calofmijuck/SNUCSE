import java.util.Scanner;

public class Lab04_pendulum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(pendulum(input));
    }

    public static boolean pendulum(String s) {
        int n = s.length();
        if(n == 1 || n == 0){
            return true;
        }
        else if(n >= 2) {
            if(s.charAt(0) == s.charAt(n - 1)){
                String q = s.substring(1, n - 1);
                return pendulum(q);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
