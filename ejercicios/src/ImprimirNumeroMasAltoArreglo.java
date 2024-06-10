public class ImprimirNumeroMasAltoArreglo {
    public static void main(String[] args) {

        int[] arreglo = {14, 33, 15, 36, 78, 79, 43};
        int max = arreglo[0];
        String respuesta = null;
        for(int i = 1; i < arreglo.length; i++){
            
            if(arreglo[i] >= 11 && arreglo[i] <= 99){
                
                if( max < arreglo[i]){
                    max = arreglo[i];
                }
                
            } else {
                respuesta = "El arreglo excede la condición (de rango 11 - 99) ";
            }
        }
        
        if( respuesta != null ){
            System.out.println(respuesta);
        } else {
            respuesta = "El máximo del arreglo es: " + max;
            System.out.println("respuesta = " + respuesta);
        }
        
    }
}
