import java.util.Scanner;

public class Lab09_Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = Integer.parseInt(sc.nextLine());
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");
        String[] input3 = sc.nextLine().split(" ");
        int[] b1 = new int[2], b2 = new int[2], b3 = new int[2];
        for(int i = 0; i < 2; i++) {
            b1[i] = Integer.parseInt(input1[i]);
            b2[i] = Integer.parseInt(input2[i]);
            b3[i] = Integer.parseInt(input3[i]);
        }
        weight -= b1[0] + b2[0] + b3[0];

    }
}

