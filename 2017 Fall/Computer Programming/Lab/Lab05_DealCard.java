import java.util.ArrayList;
import java.util.Random;

public class Lab05_DealCard {
    public static void main(String[] args){
        ArrayList<String> deck = new ArrayList<String>();
        String[] shape = new String[4];
        shape[0] = "S"; shape[1] = "H"; shape[2] = "C"; shape[3] = "D";
        for(int i = 0; i < 4; i++){
            deck.add(shape[i] + "A");
            for(int j = 1; j < 10; j++){
                deck.add(shape[i] + Integer.toString(j + 1));
            }
            deck.add(shape[i] + "J");
            deck.add(shape[i] + "Q");
            deck.add(shape[i] + "K");
        } //Deck Created
        for(int j = 0; j < 4; j++) {
            System.out.printf("Player%d: ", j);
            String draw;
            for (int i = 0; i < 13; i++) {
                draw = getRandom(deck);
                System.out.printf("%2c%2s |", draw.charAt(0), draw.substring(1));
                deck.remove(draw);
            }
            System.out.println();
        }
    }



    public static String getRandom(ArrayList<String> deck) {
        int rndindex = new Random().nextInt(deck.size());
        return deck.get(rndindex);
    }
}
