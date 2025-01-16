package pr.ellt07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e3_MenuTemperaturas_SinRepeticiones {

    public static void main(String[] args) {
        MostrarMenu();

    }

    public static void MostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int[] temperaturaMeses = new int[12]; // Definir un array de tamaño fijo (N elementos)

        int opcion = 0; // Inicializar la opción antes del bucle
        while (opcion != 4) {
            System.out.println("---------------------");
            System.out.println("1. Rellenar Array");
            System.out.println("2. Mostrar Contenido");
            System.out.println("3. MostrarOrdenInverso");
            System.out.println("4. Salir");
            System.out.println("---------------------");
            System.out.println("Elige una opcion: ");
            System.out.println("---------------------");
            opcion = scanner.nextInt(); // Leer la nueva opción del usuario

            switch (opcion) {
                case 1 -> {
                    LlenarArraySinRepetidos(temperaturaMeses); 
                    }
                case 2 -> {
                    MostrarContenido(temperaturaMeses);
                }
                case 3 -> {
                    MostrarOrdenInverso(temperaturaMeses);
                }
                case 4 -> {
                    System.out.println("Has salido!");
                }
                default ->
                    System.out.println("Opcion invalida.");
            }
        }
    }

    

    public static void LlenarArraySinRepetidos(int[] miArray) {
        Random aleatorio = new Random();
        boolean[] numerosUsados = new boolean[12]; // Array para marcar números ya generados (0 a 11)

        int i = 0;
        while (i < miArray.length) {
            int numAleatorio = aleatorio.nextInt(12); // Genera un número aleatorio entre 0 y 11
            if (!numerosUsados[numAleatorio]) { // Verifica si el número ya fue usado
                numerosUsados[numAleatorio] = true; // Marca el número como usado
                miArray[i] = numAleatorio; // Lo asignamos al array
                System.out.println("Posición --> " + (i + 1) + " -- " + miArray[i]);
                i++;
            }
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
