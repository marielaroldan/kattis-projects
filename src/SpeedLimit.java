import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeedLimit {

    private static Scanner sc = new Scanner(System.in);
    private static List totals = new ArrayList();

    public static void main(String[] args) {

        int n=sc.nextInt();

        while (n != -1){

            int[] speeds = new int[n];

            calSpeeds(n, speeds);

            totals.add(getSumSpeeds(speeds));

            n = sc.nextInt();
        }
        ending();
    }

    private static void ending() {
        for (Object mile: totals ) {
            System.out.println(mile.toString() + " miles");
        }
    }

    private static int getSumSpeeds(int[] speeds) {

        int sum = 0;
        for (int i: speeds) {
            sum+=i;
        }
        return sum;
    }

    private static void calSpeeds(int n, int[] speeds) {
        int previousTime = 0;
        int speed;
        int time;
        for (int i = 0; i < n; i++) {
            speed = sc.nextInt();
            time = sc.nextInt();
            int total = (time - previousTime) * speed;
            previousTime = time;
            speeds[i] = total;
        }
    }
}
