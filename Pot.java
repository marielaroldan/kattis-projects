import java.util.Scanner;

public class Pot {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long total = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            int pot = temp % 10;
            long numero = temp / 10;
            total += Math.pow(numero,pot);
        }
        System.out.println(total);
    }
}
