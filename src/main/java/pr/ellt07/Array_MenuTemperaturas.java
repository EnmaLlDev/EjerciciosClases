package pr.ellt07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_MenuTemperaturas {

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
            System.out.println("2. Temperatura media del año");
            System.out.println("3. Meses mas calidos");
            System.out.println("4. Hallar mes calido");
            System.out.println("5. Recorre de otra forma");
            System.out.println("6. Temperaturas repetida");
            System.out.println("7. Salir");
            System.out.println("---------------------");

            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt(); // Leer la nueva opción del usuario

            switch (opcion) {
                case 1 -> {
                    RellenarArray(temperaturaMeses);
                }
                case 2 -> {
                    TemperaturaMedia(temperaturaMeses);
                }
                case 3 -> {
                    MesesCalidos(temperaturaMeses);
                }
                case 4 -> {
                    HallarMesCalido(temperaturaMeses);
                }
                case 5 -> {
                    RecorrerOtraForma(temperaturaMeses);
                }
                case 6 -> {
                    TemperaturasRepetidas(temperaturaMeses);
                }
                case 7 -> {
                    System.out.println("Has salido!");
                }
                default ->
                    System.out.println("Opcion invalida.");
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

    public static void TemperaturaMedia(int[] miArray) {
        double suma = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        System.out.println(suma / miArray.length);
    }

    public static void MesesCalidos(int[] miArray) {
        final int TEMPERATURAMAX = 30;
        int[] meses = new int[miArray.length]; // Para guardar las posiciones de los meses calurosos
        int[] temperaturas = new int[miArray.length]; // Para guardar las temperaturas de los meses calurosos
        int contador = 0;

        // Filtrar los meses calurosos y guardar posiciones y temperaturas
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > TEMPERATURAMAX) {
                meses[contador] = i; // Guardar la posición
                temperaturas[contador] = miArray[i]; // Guardar la temperatura
                contador++;
            }
        }

        // Imprimir resultados
        if (contador == 0) {
            System.out.println("No hubo meses con temperaturas superiores a " + TEMPERATURAMAX + " grados.");
        } else {
            System.out.println("Los meses mas calidos del año fueron:");
            for (int i = 0; i < contador; i++) {
                System.out.println("Mes " + meses[i] + " con temperatura: " + temperaturas[i] + "°C");
            }
        }
    }

    public static void HallarMesCalido(int[] miArray) {
        int temperaturaMayor = 30;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > temperaturaMayor) {
                temperaturaMayor = miArray[i];
                System.out.println("Has hallado una temperatura mayor a 30 en el mes: " + i);
                break;//Salids del bucle
            }
        }
    }

    public static void RecorrerOtraForma(int[] miArray) {
        // Ordenar el array
        Arrays.sort(miArray);
        // Imprimir los elementos mayores a 30
        System.out.println("Temperatura mayor a 30 y su posicion:");
        boolean encontrado = false;

        while (!encontrado) {
            for (int i = 0; i < miArray.length; i++) {
                if (miArray[i] > 30) {
                    System.out.println("Posición: " + i + ", Valor: " + miArray[i]);
                    encontrado = true;
                }
            }
        }
        System.out.println("No se encontraron elementos mayores a 30.");
    }

    public static void TemperaturasRepetidas(int[] miArray) {
        int contadorMeses = 0;
        int temperaturaAnterior = miArray[0];
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == temperaturaAnterior) {
                System.out.println(i + " Mes, repite la tmeperatura del mes: " + temperaturaAnterior);
                contadorMeses++;
            }
        }
        System.out.println("La cantidad de repeciones en el array es: " + contadorMeses);
    }   
}