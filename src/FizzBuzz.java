import java.util.Scanner;

public class FizzBuzz {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

        for (int i = 1; i <=z; i++) {
            if ((i%x==0) && (i%y==0)){
                System.out.println("FizzBuzz");
            }else if ((i%x==0)){
                System.out.println("Fizz");
            }else if ((i%y==0)){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
