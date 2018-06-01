import java.util.ArrayList;
import java.util.Scanner;

public class Lab02_PrimeFind {
    public static void main(String[] args) {
        int num = scan_example();
        ArrayList primes = new ArrayList();
        ArrayList perfects = new ArrayList();
        ArrayList<Integer> fibs = new ArrayList();
        ArrayList<Integer> Mersenne = new ArrayList();
        ArrayList isPe = new ArrayList();
        ArrayList isFib = new ArrayList();
        ArrayList isMer = new ArrayList();

        // Create a list with primes under n
        for (int i = 2; i <= num; i++) {
            if (PrimesUnderN(i) == 1) {
                primes.add(i);
            }
        }

        // Create a list with perfect numbers under n
        for (int i = 1; i <= num; i++) {
            if(CheckPerfect(i) == 1) {
                perfects.add(i);
            }
        }

        // Create a list with Fibbonacci numbers, to the nth term.
        fibs.add(0);
        fibs.add(1);
        for(int i = 1; i < num; i++) {
            fibs.add(fibs.get(i-1) + fibs.get(i));
        }

        // Create a list with Mersenne Prime numbers.
        for(int i = 2; i <= num; i *= 2) {
            Mersenne.add(i- 1);
        }


        //Now check if it is in the list.
        int pe=0, fi=0, me=0;

        for (int i = 1; i <= num; i++) {
            if (perfects.contains(i)) {
                pe += 1;
                isPe.add(i);
            }
            if (primes.contains(i) & fibs.contains(i)) {
                fi += 1;
                isFib.add(i);
            }
            if (primes.contains(i) & Mersenne.contains(i)) {
                me += 1;
                isMer.add(i);
            }
        }

        System.out.println("[" + pe + ", " + fi + ", " + me + "]");
        System.out.print("[6");
        for (int i = 1; i < isPe.size(); i++ ) {
            System.out.print(", "+ isPe.get(i));
        }
        System.out.println("]");
        System.out.print("[2");
        for (int i = 1; i < isFib.size(); i++ ) {
            System.out.print(", "+ isFib.get(i));
        }
        System.out.println("]");
        System.out.print("[3");
        for (int i = 1; i < isMer.size(); i++ ) {
            System.out.print(", "+ isMer.get(i));
        }
        System.out.println("]");
    }

    public static int PrimesUnderN(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if( x % i == 0) { // not prime
                return -1;
            }
        } // is prime
        return 1;
    }


    public static int CheckPerfect(int x) {
        ArrayList<Integer> divisors = new ArrayList();
        // Now create a list with divisors
        for (int i = 1; i < x ; i++) {
            if (x % i == 0) {
                divisors.add(i);
            }
        }

        // Calculate the sum of divisors
        int sumOfDivisor = 0;
        for (int i = 0; i < divisors.size(); i++) {
            sumOfDivisor += divisors.get(i);
        }

        // Now check if this number is perfect;
        if( sumOfDivisor == x) {
            return 1;
        }
        else{
            return 0;
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
