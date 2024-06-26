import java.util.Scanner;

public class ImprimirUnaXMatriz {
    public static void main(String[] args) {

        int n;
        String[][] matriz;

        Scanner s = new Scanner(System.in);

        System.out.print("Introducir un tamaño: ");
        n = s.nextInt();

        if( n == 0){
            System.err.println("ERROR: Se debe introducir un tamaño mayor a 0!");
            System.exit(1);
        }

        matriz = new String[n][n];

        /*for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j || j == n - i - 1){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }

            }
        }*/

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j ){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
                matriz[i][matriz[i].length - i - 1] = "X";
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
