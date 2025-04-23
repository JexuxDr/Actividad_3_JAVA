public class RegistroVisitante {
    public static void main(String[] args) {
        String nombre = "Bruce Wayne";
        byte edad = 28;
        short numeroApartamento = 205;
        long numeroIdentificacion = 987654321L;
        int tiempoPermitido = 3;
        float temperaturaCorporal = 37.2f;
        double peso = 82.3;
        char genero = 'M';
        boolean esPrimeraVisita = false;

        System.out.println("Información del visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de apartamento a visitar: " + numeroApartamento);
        System.out.println("Número de identificación: " + numeroIdentificacion);
        System.out.println("Tiempo permitido para la visita: " + tiempoPermitido + " horas");
        System.out.println("Temperatura corporal: " + temperaturaCorporal + " °C");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Género: " + genero);
        System.out.println("¿Primera visita?: " + esPrimeraVisita);
    }
}