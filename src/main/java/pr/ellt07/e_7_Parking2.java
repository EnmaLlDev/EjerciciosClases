
package pr.ellt07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import pr.ellt07.Clases_Parking.Parking2;

public class e_7_Parking2 {
    
    public static void main(String[] args) {
        Parking2 estacionamiento = new Parking2();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0; 
        while (opcion != 5) {
            System.out.println("---------------------");
            System.out.println("1. Mostrar estado PARKING");
            System.out.println("2. Aparcar");
            System.out.println("3. Desaparcar");
            System.out.println("4. Mostrar Plazas Libres");
            System.out.println("5. Calcular Pago");
            
            System.out.println("6. Salir");
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
                
                case 5 ->{ 
                    System.out.print("Introduce los minutos:");
                    int minutosParking = scanner.nextInt();
                    estacionamiento.calcularPago(minutosParking);
                    
                }
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
    