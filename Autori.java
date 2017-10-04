import java.util.Scanner;

public class Autori {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String autor = sc.nextLine();
        String[] aux = autor.split("-");
        String outPut = "";
        for (String a: aux) {
            outPut += a.charAt(0);
        }
        System.out.println(outPut);
    }
}
