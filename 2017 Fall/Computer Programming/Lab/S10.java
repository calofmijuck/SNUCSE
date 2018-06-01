import java.io.*;

public class S10 {
    public static void main(String[] args)
    throws Exception {
	File folder = new File("C:/Users/zxcvber/Desktop");
	System.out.println(folder.isDirectory());
	crawl(folder);
	// printStars(20);
	// printBinary(42);
	// System.out.println(isPalindrome("able was I ere I saw elba"));
    }

    public static void crawl(File f) {
	crawl(f, ""); // call private recursive helper
    }

    private static void crawl(File f, String indent) {
	System.out.println(indent + f.getName());
	if(f.isDirectory()) {
	    // recursive case; print contained file/dirs
	    for(File subFile: f.listFiles()) {
		crawl(subFile, indent + "    ");
	    }
	}
    }
    public static void printStars(int n) {
	if(n == 1)
	    System.out.println("*");
	else {
	    System.out.print("*");
	    printStars(n - 1);
	}
    }

    public static long pow(int a, int b){
	if(b == 0) {
	    return 1;
	} else if(b == 1) {
	    return a;
	} else if(b % 2 == 0) {
	    return pow(a * a, b / 2);
	} else {
	    return a * pow(a, b - 1);
	}
    }

    public static void printBinary(int n) {
	String s = "";
	if(n < 0) {
	    System.out.print("-");
	    printBinary(-n);
	} else if(n < 2) {
	    System.out.print(n);
	} else {
	    printBinary(n / 2);
	    printBinary(n % 2);
	}
    }

    public static boolean isPalindrome(String str) {
	if(str.length() < 2) {
	    return true;
	} else {
	    if(str.charAt(0) == str.charAt(str.length() - 1)) {
		return isPalindrome(str.substring(1, str.length() - 1));
	    } else {
		return false;
	    }
	}
    }
}
