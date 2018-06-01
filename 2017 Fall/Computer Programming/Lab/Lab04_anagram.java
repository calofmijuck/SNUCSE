
import java.util.Scanner;

public class Lab04_anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input1: ");
        String input1 = scan.nextLine().toLowerCase();
        System.out.print("Input2: ");
        String input2 = scan.nextLine().toLowerCase();
        if(Anagram(input1, input2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static boolean Anagram(String input1, String input2) {
        input1 = input1.replaceAll(" ", "");
        input2 = input2.replaceAll(" ", "");
        for(int i = 0; i < 10; i++){
            input1 = input1.replaceAll(Integer.toString(i), "");
            input2 = input2.replaceAll(Integer.toString(i), "");
        }
        for(int i = 97; i < 123; i++){
            char c = (char) i;
            int count1 = input1.length() - input1.replaceAll(Character.toString(c), "").length();
            int count2 = input2.length() - input2.replace(Character.toString(c), "").length();
            if(count1 != count2){
                return false;
            }
        }
        return true;

    }
}
