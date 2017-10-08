import java.util.Scanner;

public class Oddities {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] numbers = new int[num];
        String[] result = new String[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i]%2==0){
                result[i]= numbers[i]+" is even";
            }else{
                result[i]= numbers[i]+" is odd";
            }
        }
        for (String s: result){
            System.out.println(s);
        }
    }
}
