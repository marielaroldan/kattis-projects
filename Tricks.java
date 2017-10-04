import java.util.Scanner;

public class Tricks {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String movements = sc.nextLine().toUpperCase();
        int posicion = 1;
        for (int i = 0; i < movements.length(); i++) {
            char move = movements.charAt(i);
            switch (move) {
                case 'A':posicion = moveA(posicion);
                break;
                case 'B':posicion = moveB(posicion);
                break;
                case 'C':posicion = moveC(posicion);
                break;
            }
        }
        System.out.println(posicion);
    }

    private static int moveA(int p) {
        if (p == 1)
            return 2;
        else if (p == 2)
            return 1;
        return 3;
    }

    private static int moveB(int p) {
        if (p == 3)
            return 2;
        else if (p == 2)
            return 3;
        return 1;
    }

    private static int moveC(int p) {
        if (p == 3)
            return 1;
        else if (p == 1)
            return 3;
        return 2;
    }

}
