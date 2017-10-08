import java.util.Scanner;

public class Kornislav {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] sides = new int[4];
        for (int i = 0; i < 4; i++) {
            sides[i] = sc.nextInt();
        }
        quickSort(sides,0,3);
        System.out.println(sides[0]*sides[2]);

    }
    public static void quickSort(int lista1[], int izq, int der){
        int i=izq;
        int j=der;
        int pivote=lista1[(i+j)/2];
        do {
            while (lista1[i]<pivote){
                i++;
            }
            while (lista1[j]>pivote){
                j--;
            }
            if (i<=j){
                int aux=lista1[i];
                lista1[i]=lista1[j];
                lista1[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if (izq<j){
            quickSort(lista1, izq, j);
        }
        if (i<der){
            quickSort(lista1, i, der);
        }
    }
}
