import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        int longitud = 0, positivos= 0, negativos= 0, ceros= 0;
        int contP = 0, contN = 0;

        Scanner s = new Scanner(System.in);
        longitud = arreglo.length;

        for(int i = 0; i < longitud; i++){
            System.out.print("Introduce un número: ");
            arreglo[i] = s.nextInt();
        }

        for(int i = 0; i < longitud; i++){

            if( arreglo[i] > 0){ // Es positivo
                positivos += arreglo[i];
                contP++;
            } else if( arreglo[i] < 0) {
                negativos += arreglo[i];
                contN++;
            } else {
                ceros++;
            }

        }

        if( contP == 0){
            System.out.println("No se pudo calcular el promedio de números positivos");
        } else {
            System.out.println("El promedio de los números positivos es: " + ( (float) positivos/contP) );
        }

        if( contP == 0){
            System.out.println("No se pudo calcular el promedio de números negativos");
        } else {
            System.out.println("El promedio de los números negativos es: " + ( (float)  negativos/contN) );
        }

        System.out.println("La cantidad de cero es de: " + ceros);


    }
}
