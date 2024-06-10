import java.util.Scanner;

public class OrdenarArregloUltimoPrimero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Introduce un número: ");
            a[i] = s.nextInt();
        }

        System.out.println();

        System.out.println("El resultado es:");
        for(int i = 0; i < (a.length/2); i++){
            System.out.println(a[9 - i]);
            System.out.println(a[i]);
        }
    }
}
