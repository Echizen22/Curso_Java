import java.util.Scanner;

public class ImprimirUnaSillaMatriz {
    public static void main(String[] args) {

        int n;
        int[][] matriz;

        Scanner s = new Scanner(System.in);

        System.out.print("Introducir un tamaño: ");
        n = s.nextInt();

        if( n == 0){
            System.err.println("ERROR: Se debe introducir un tamaño mayor a 0!");
            System.exit(1);
        }

        matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(j == 0 || i == matriz[i].length/ 2 || (i > matriz[i].length / 2 && j == matriz[i].length -1 )  ){
                    matriz[i][j] = 1;
                }
            }
        }

        System.out.println("Diseño de matriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
