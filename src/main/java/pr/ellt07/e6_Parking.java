package pr.ellt07;
import java.util.Scanner;

public class e6_Parking {

    public static void main(String[] args) {

        Parking estacionamiento = new Parking();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0; // Inicializar la opción antes del bucle
        while (opcion != 5) {
            System.out.println("---------------------");
            System.out.println("1. Mostrar estado PARKING");
            System.out.println("2. Aparcar");
            System.out.println("3. Desaparcar");
            System.out.println("4. Mostrar Plazas Libres");
            System.out.println("5. Salir");
            System.out.println("---------------------");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt(); // Leer la nueva opción del usuario

            switch (opcion) {
                case 1 -> estacionamiento.mostrarEstado();
                case 2 -> {
                    System.out.print("Introduce la matrícula del coche: ");
                    String matricula = scanner.next();
                    System.out.println(matricula);
                    estacionamiento.aparcar(matricula);
                }
                case 3 -> {
                    System.out.print("Introduce la matrícula del coche a desaparcar: ");
                    String matricula = scanner.nextLine();
                    estacionamiento.desaparcar(matricula);
                }
                case 4 -> estacionamiento.mostrarPlazasLibres();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    public static class Parking {

        private String[] plazas;

        public Parking() {
            this.plazas = new String[20];
        }

        // Mostrar el estado actual del parking
        public void mostrarEstado() {
            System.out.println("Estado del Parking:");
            for (int i = 0; i < plazas.length; i++) {
                if (plazas[i] == null) {
                    System.out.println("Plaza " + (i + 1) + ": Libre");
                } else {
                    System.out.println("Plaza " + (i + 1) + ": Ocupada por " + plazas[i]);
                }
            }
        }

        // Aparcar un coche
        public void aparcar(String matricula) {
            for (int i = 0; i < plazas.length; i++) {
                if (plazas[i] == null) { // Encontrar una plaza libre
                    plazas[i] = matricula;
                    System.out.println("Coche " + matricula + " aparcado en la plaza " + (i + 1) + ".");
                    return;
                }
            }
            System.out.println("No hay plazas libres para aparcar.");
        }

        // Desaparcar un coche
        public void desaparcar(String matricula) {
            for (int i = 0; i < plazas.length; i++) {
                if (matricula.equals(plazas[i])) {
                    plazas[i] = null;
                    System.out.println("Coche " + matricula + " ha sido desparcado de la plaza " + (i + 1) + ".");
                    return;
                }
            }
            System.out.println("El coche con matrícula " + matricula + " no está aparcado aquí.");
        }

        // Mostrar número de plazas libres
        public void mostrarPlazasLibres() {
            int libres = 0;
            for (String plaza : plazas) {
                if (plaza == null) {
                    libres++;
                }
            }
            System.out.println("Plazas libres: " + libres + " de " + plazas.length);
        }
    }
}
