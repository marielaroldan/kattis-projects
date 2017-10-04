import java.util.Scanner;

public class PokerDeck {

    private static Scanner sc = new Scanner(System.in);

    private static int P = 13;
    private static int K = 13;
    private static int H = 13;
    private static int T = 13;

    public static void main(String[] args) {

        String input = sc.nextLine();
        //List cards = new ArrayList();
        String[] cards = new String[4];
        namedCards(input, cards);

        if (thereAreMoreThanOne(cards)) {
            System.out.println("GRESKA");
        } else {
            missingCards(cards);
            System.out.println(P + " " + K + " " + H + " " + T);
        }
    }

    private static void namedCards(String input, String[] cards) {
        int i = 0;
        int j = 0;
        do {
            cards[j] = input.substring(i, i = i + 3);
            j++;
        } while (i != (input.length()));
    }

    public static boolean thereAreMoreThanOne(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
            String card = cards[i];
            for (int j = i + 1; j < cards.length; j++) {
                if (card.equals(cards[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void missingCards(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
            String initial = cards[i].substring(0,1);
            if (initial.equals("P")) {
                P--;
            } else if (initial.equals("K")) {
                K--;
            } else if (initial.equals("H")) {
                H--;
            } else {
                T--;
            }
        }
    }
}
