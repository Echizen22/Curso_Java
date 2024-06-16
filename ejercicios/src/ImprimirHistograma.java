import java.util.Scanner;

public class ImprimirHistograma {
    public static void main(String[] args) {

        int[] arreglo = new int[12];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Introduce un número entero entre (1 al 6): ");
            arreglo[i] = s.nextInt();
        }

        String[] arregloHistograma = new String[6];

        // Rellenamos el histograma
        for(int i = 0; i < arregloHistograma.length; i++){
            int aux = i + 1;
            String histograma = aux + ": ";
            for(int j = 0; j < arreglo.length; j++){
                if(aux == arreglo[j]){
                    histograma += "*";
                }
            }
            arregloHistograma[i] = histograma;
        }

        // mostramos el Histograma
        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }
    }
}
