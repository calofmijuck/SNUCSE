import java.util.Random;

public class Lab04_SimpleCardGame {
    public static void main(String[] args){
        String[] deck = new String[52];
        String[] shape = new String[4];
        shape[0] = "S"; shape[1] = "H"; shape[2] = "C"; shape[3] = "D";
        for(int i = 0; i < 4; i++){
            deck[13 * i] = shape[i] + "A";
            for(int j = 1; j < 10; j++){
                deck[13 * i + j] = shape[i] + Integer.toString(j + 1);
            }
            deck[13 * i + 10] = shape[i] + "J";
            deck[13 * i + 11] = shape[i] + "Q";
            deck[13 * i + 12] = shape[i] + "K";
        } //Deck Created!
        System.out.println("P1" + "     " + "P2");
        String card1 = getRandom(deck);
        System.out.print(card1 + "     ");
        int loop_count = 0;
        while(true) {
            String card2 = getRandom(deck);
            System.out.println(card2);
            if(card1.charAt(0) == card2.charAt(0)) {
                if(loop_count % 2 == 0 ){
                    System.out.println("P2 wins!");
                }
                else {
                    System.out.println("P1 wins!");
                }
                break;
            }
            card1 = getRandom(deck);
            System.out.print(card1 + "     ");
            loop_count++;
        }

    }


    public static String getRandom(String[] array) {
        int rndindex = new Random().nextInt(array.length);
        return array[rndindex];
    }
}
