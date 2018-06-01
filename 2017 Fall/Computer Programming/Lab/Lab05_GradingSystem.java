import java.util.Scanner;

public class Lab05_GradingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score_assign = sc.nextInt(), score_bonus = sc.nextInt();
        int absence = sc.nextInt(), score_mid = sc.nextInt(), score_final = sc.nextInt();
        int assign = 0;
        if(score_assign + score_bonus >= 100){
            assign += 100;
        }
        else{
            assign += score_assign + score_bonus;
        }
        int temp = 20, base = 1;
        for(int i = 0; i < absence; i++) {
            temp -= base;
            base *= 2;
        }
        if(temp < 0){temp = 0;}
        double attend = temp;
        double midterm = 1.0 * score_mid / 120 * 100;
        double final_score = assign * 0.2 + attend * 0.5 + midterm * 0.35 + score_final * 0.35;

        Grade(final_score);
    }

    public static void Grade(double score){
        if(score <= 100 && score > 95){
            System.out.println("A+");
        }
        else if(score <= 95 && score > 90){
            System.out.println("A0");
        }
        else if(score <= 90 && score > 85){
            System.out.println("A-");
        }
        else if(score <= 85 && score > 80){
            System.out.println("B+");
        }
        else if(score <= 80 && score > 75){
            System.out.println("B0");
        }
        else if(score <= 75 && score > 70){
            System.out.println("B-");
        }
        else if(score <= 70 && score > 60){
            System.out.println("C+");
        }
        else if(score <= 60 && score > 50){
            System.out.println("C0");
        }
        else if(score <= 50 && score > 40){
            System.out.println("C-");
        }
        else if(score <= 40 && score > 25){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
