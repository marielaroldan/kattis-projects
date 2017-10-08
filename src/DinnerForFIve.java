import java.util.Scanner;

/**
 * Created by marie on 20/9/2017.
 */
public class DinnerForFIve {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int maxScore = 0;
        int contestantWinner = 0;
        for (int i = 1; i <= 5 ; i++) {
            int score = 0;
            for (int j = 0; j < 4 ; j++) {
                score += sc.nextInt();
            }
            if (score>maxScore){
                maxScore = score;
                contestantWinner = i;
            }
        }
        System.out.println(contestantWinner + " " + maxScore);
    }
}
