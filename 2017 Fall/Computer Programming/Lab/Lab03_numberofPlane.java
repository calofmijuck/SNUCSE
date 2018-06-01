import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab03_numberofPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[5][3];
        for(int i = 0; i < 5; i++){
            String line =scanner.nextLine();
            String[] temp = line.split(",");
            for(int j = 0; j < 3; j++){
                a[i][j] = Integer.parseInt(temp[j]);
            }
        }
        String[] ans = new String[10];
        ans[0] = Plane(a[0], a[1], a[2]);
        ans[1] = Plane(a[0], a[1], a[3]);
        ans[2] = Plane(a[0], a[1], a[4]);
        ans[3] = Plane(a[0], a[2], a[3]);
        ans[4] = Plane(a[0], a[2], a[4]);
        ans[5] = Plane(a[1], a[2], a[3]);
        ans[6] = Plane(a[1], a[2], a[4]);
        ans[7] = Plane(a[1], a[3], a[4]);
        ans[8] = Plane(a[2], a[3], a[4]);
        ans[9] = Plane(a[0], a[3], a[4]);

        System.out.println(distinctNumberOfItems(ans));

    }


    public static String Plane(int[] p1, int[] p2, int[] p3) {
        int[] normal = new int[3];
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i = 0; i <3 ; i++) {
            a[i] = p2[i] - p1[i];
            b[i] = p3[i] - p2[i];
        }
        normal[0] = a[1] * b[2] - a[2] * b[1];
        normal[1] = a[2] * b[0] - a[0] * b[2];
        normal[2] = a[0] * b[1] - a[1] * b[0];
        if(normal[0] < 0){
            for(int i = 0; i < 3; i++){
                normal[i] *= -1;
            }
        }
        int gcd = gcd3(normal[0], normal[1], normal[2]);
        for(int i = 0; i < 3; i++){
            normal[i] /= gcd;
        }
        int d = 0;
        for(int i = 0; i < 3; i++){
            d += normal[i]* p1[i];
        }
        return normal[0] + "x+" + normal[1] + "y+" + normal[2] + "z=" + d;

    }

    public static int gcd3(int x, int y, int z) {
        int limit = Math.min(Math.abs(x), Math.abs(y));
        limit = Math.min(limit, Math.abs(z));
        for(int n = limit; n >= 2; n--)
        {
            if ( (x % n == 0) && (y % n == 0) && (z % n == 0) ) {
                return n;
            }
        }
        return 1;
    }
    public static int distinctNumberOfItems(String[] array) {
        if (array.length <= 1) {
            return array.length;
        }

        Set<String> set = new HashSet<String>();
        for (int i = 1; i < array.length; i++) {
            set.add(array[i]);
        }
        return set.size() + 1;
    }
}
