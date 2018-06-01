import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Lab06_RoomAlloc {
    public static void main(String[] args)
            throws FileNotFoundException {
        File input = new File(args[0]);
        PrintStream out = new PrintStream(new File(args[1]));
        Scanner sc = new Scanner(input);
        int n = Integer.parseInt(sc.nextLine());
        out.println("Total number of rooms: " + n);
        String[][] people = new String[50][2];
        String[] ans = new String[n + 1];
        ans[0] = "No problems found.";
        for(int i = 0; i < n; i++){
            ans[i + 1] = "0";
            String room = sc.nextLine();
            int num = Integer.parseInt(room.split(": ")[1]);
            for(int j = 0; j < num; j++){
                people[j] = sc.nextLine().split(", ");
            }
            out.printf("Room %d: %d\n", i + 1, num);
            for(int j = 0; j < num; j++){
                out.println(people[j][0]);
            }
            String gender = people[0][1];
            for(int k = 1; k < num; k++){
                if(!gender.equals(people[k][1])){
                    ans[i + 1] = "1";
                }
            }
        }
        String rooms = "\0";
        for(int i = 1; i <= n; i++){
            if(ans[i].equals("1")){
                ans[0] = "Problems found in";
                rooms += Integer.toString(i) + ", ";
            }
        }
        out.println(ans[0] + rooms.substring(0, Math.max((rooms.length() - 2), 0)));

    }
}
