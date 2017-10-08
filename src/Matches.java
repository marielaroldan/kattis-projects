import java.util.Scanner;

public class Matches {
    private static Scanner sc = new Scanner(System.in);

    private static final String MACHT_FITS = "DA";
    private static final String MACHT_NOT_FITS = "NE";

    public static void main(String[] args) {
        int matches = sc.nextInt();
        int n = sc.nextInt();
        int h = sc.nextInt();

        int dig = (int) Math.sqrt((n*n+h*h));

        String[] arrMatches = new String[matches];
        for (int i = 0; i < matches; i++) {
           int a = sc.nextInt();
           if (a<=dig)
               arrMatches[i]=MACHT_FITS;
           else
               arrMatches[i]=MACHT_NOT_FITS;
        }
        for (String s:arrMatches) {
            System.out.println(s);
        }
    }
}
