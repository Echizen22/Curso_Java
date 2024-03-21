public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        
        boolean esIgual = curso == curso2; // Se compara la referencia
        System.out.println("curso == curso2 = " + esIgual);
        
        esIgual = curso.equals(curso2); // Se compara el valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
        
    }
}
