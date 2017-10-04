import java.util.Scanner;

public class StuckInATimeLoop {
    static Scanner sc = new Scanner(System.in);

    static final String ABRACADABRA = "Abracadabra";
    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " "+ABRACADABRA);
        }
    }
}
