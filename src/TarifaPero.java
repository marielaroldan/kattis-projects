import java.util.Scanner;

/**
 * Created by marie on 20/9/2017.
 */
public class TarifaPero {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int megasPerMonth = sc.nextInt();
        int numMonth= sc.nextInt();
        int carries = 0;
        for (int i = 0; i < numMonth; i++) {
            int aux = carries + megasPerMonth;
            int megasSpends = sc.nextInt();
            carries = aux - megasSpends;
        }
        System.out.println(megasPerMonth+carries);
    }
}
