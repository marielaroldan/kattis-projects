import java.util.Scanner;

/**
 * Created by marie on 20/9/2017.
 */
public class BelowCero {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int days = sc.nextInt();
        int j = 0;
        for (int i = 0; i < days; i++) {
            int temp = sc.nextInt();
            if (temp <0) {
                j++;
            }
        }
        System.out.println(j);
    }
}
