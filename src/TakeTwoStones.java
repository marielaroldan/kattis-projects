import java.util.Scanner;

/**
 * Created by marie on 22/9/2017.
 */
public class TakeTwoStones {
    static Scanner sc = new Scanner(System.in);

    static final String ALICE = "Alice";
    static final String BOB= "Bob";

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n%2 == 0){
            System.out.println(BOB);
        }else{
            System.out.println(ALICE);
        }
    }
}
