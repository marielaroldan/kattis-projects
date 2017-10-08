import java.util.Scanner;

public class Leader {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

     int h = sc.nextInt();
     double v = sc.nextInt();
     v = Math.toRadians(v);
     double l = h/Math.sin(v);
     System.out.println((int)Math.ceil(l));

    }
}
