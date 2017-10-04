import java.util.Scanner;

/**
 * Mirko has found an old chessboard and a set of pieces in his attic. Unfortunately, the set contains only white pieces,
 * and apparently an incorrect number of them. A set of pieces should contain:
 One king
 One queen
 Two rooks
 Two bishops
 Two knights
 Eight pawns
 Mirko would like to know how many pieces of each type he should add or remove to make a valid set.
 * Created by marie on 20/9/2017.
 */
public class Bijele {
    private static Scanner sc = new Scanner(System.in);
    static final int[] PIECES = {1,1,2,2,2,8};

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            int piece = sc.nextInt();
            System.out.print((PIECES[i]-piece)+" ");
        }
    }
}
