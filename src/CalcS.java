import java.util.Scanner;

/**
 * Created by marie on 19/9/2017.
 */
public class CalcS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r1 = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(2*s-r1);
        sc.close();
    }
}
