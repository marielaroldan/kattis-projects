import java.util.Scanner;

/**
 * Created by marie on 21/9/2017.
 */
public class PlaninaAlgoritm {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int iterations = sc.nextInt();
        int a = (int) (Math.pow(2, iterations) + 1);
        int pow = (int) Math.pow(a, 2);
        System.out.println(pow);
    }
}
