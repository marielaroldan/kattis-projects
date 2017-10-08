import java.util.Scanner;

public class Modulo {
    private static Scanner sc = new Scanner(System.in);

    static final int Divisor = 42;
    public static void main(String[] args) {
        int isModulo = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            System.out.println("% "+num%Divisor);
        }
    }
}
