package pr.ellt07;

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
            System.out.println("6. Salir");
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
                    MesesMasCalidos(temperaturaMeses);
                }
                case 4 -> {
                    HallarMesCalido(temperaturaMeses);
                }
                case 5 -> {
                    RecorrerOtraForma(temperaturaMeses);
                }
                case 6 -> {
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

    public static void MesesMasCalidos(int[] miArray) {
        final int TEMPERATURAMAX = 30;
        int[] mesesCalidos= new int[12];
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > TEMPERATURAMAX) {
                mesesCalidos[i] = miArray[i];
            }
        }
        System.out.println("Los meses mas calidos del año fueron: ");
        for (int i=0;i<mesesCalidos.length;i++) {
            System.out.println(i+" Mes: "+ mesesCalidos[i]);
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
/*
      int temperaturaMax=miArray[0];
            for(int i=1;i<miArray.length;i++){ 
                
                if(miArray[i]>temperaturaMax) 
                    temperaturaMax=miArray[i];
            }
            
        return temperaturaMax;
    
*/
