package pr.ellt07;

import java.util.*;
import java.util.Scanner;

public class ELLt07e1 {
    /*
    7.1. Realiza un programa que tenga definido un Array como variable global llamado 
        temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada 
        uno de los meses del año. Serán valores enteros negativos o positivos. 
        
        El programa tendrá diferentes funciones que realicen las siguientes tareas: 
    
            a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40). 
            b) Mostrar por pantalla el contenido del Array. 
            c) Mostrar por pantalla el contenido del Array en orden inverso.
     */

    public static void main(String[] args) {
        MostrarMenu();
    }

    
    public static void MostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[20]; // Definir un array de tamaño fijo (N elementos)

        int opcion = 0; // Inicializar la opción antes del bucle
        
        while (opcion != 4) {
            System.out.println("---------------------");
            System.out.println("1. Rellenar Array");
            System.out.println("2. Mostrar contenido");
            System.out.println("3. Mostrar en orden inverso");
            System.out.println("4. Salir");
            System.out.println("---------------------");

            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt(); // Leer la nueva opción del usuario

            switch (opcion) {
                case 1 -> {
                    RellenarArray(miArray);
                }
                case 2 -> {
                    MostrarContenido(miArray);
                }
                case 3 -> {
                    MostrarOrdenInverso(miArray);
                }
                case 4 -> {
                    System.out.println("Has salido!");
                }
                default -> System.out.println("Opcion invalida.");
            }
        }
        scanner.close(); // Cerrar el scanner al salir del programa
    }

    public static void RellenarArray(int[] miArray) {
        
        Random aleatorio = new Random();
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = aleatorio.nextInt(40); // Genera un número aleatorio entre 0 y 39
            System.out.println("Posicion --> " + (i + 1) + " -- " + miArray[i]); // i + 1 para que la posición comience en 1
        }
    }

    public static void MostrarContenido(int[] miArray) {
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Posicion --> " + (i + 1) + " -- " + miArray[i]);
        }
    }

    public static void MostrarOrdenInverso(int[] miArray) {
        for (int i = miArray.length - 1; i >= 0; i--) {
            System.out.println("Orden inverso --> " + (miArray.length - i) + " -- " + miArray[i]);
        }
    }
}
