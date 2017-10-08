import java.util.Scanner;

public class ReversedBinaryNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long num = sc.nextInt();
        String reverse = reverseString(Long.toBinaryString(num));
        System.out.println(toInt(reverse));
    }

    private static String reverseString(String num) {
        char[] binari = num.toCharArray();
        String aux="";
        for (int i = binari.length-1; i>=0; i--) {
            aux +=binari[i];
        }
        return aux;
    }

    private static long toInt (String binaryNum){
        char[] charact = binaryNum.toCharArray();
        int i = charact.length-1;
        int numDecimal = 0;
        for (char c: charact) {
            int cAux = c - '0';
            int pow = (int)Math.pow(2, i);
            numDecimal = numDecimal + (cAux * pow);
            i--;
        }
        return numDecimal;
    }
}
