import java.util.Scanner;

public class mayorOcurrenciaArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int[] mayorOcurrencia = new int[10];
        int indice = 0;
        int max = 0;

        Scanner s = new Scanner(System.in);
        int logitud = arreglo.length;
        System.out.println("Introducir números enteros en el rango de (1 a 9): ");
        for(int i = 0; i < logitud; i++){
            arreglo[i] = s.nextInt();
        }

        for(int i = 0; i < logitud; i++){
            int cantidad = 0;
            for(int j = 0; j < logitud; j++){
                if(arreglo[i] == arreglo[j]){
                    cantidad++;
                }
                mayorOcurrencia[i] = cantidad;
            }
        }

        for(int i = 0; i < logitud; i++){
            if(max < mayorOcurrencia[i]){
                max = mayorOcurrencia[i];
                indice = i;
            }
        }

        System.out.println("La mayor ocurrencias es: " + max);
        System.out.println("El elemento que más se repite es: " + arreglo[indice]);
    }
}
