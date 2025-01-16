package pr.ellt07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class e5_Sorteo_Clase {

    public static void main(String[] args) {
        // Programa que permite al usuario introducir los 6 números de su boleto y le indica cuántos acertó.
        Primitiva boletoGanador = new Primitiva();
        boletoGanador.generarNumeroBoleto();

        // Solicitar al usuario que introduzca sus números
        int[] numeroUsuario = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los 6 números de tu boleto (entre 1 y 49):");
        for (int i = 0; i < numeroUsuario.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 49) {
                    numeroUsuario[i] = numero;
                    break;
                } else {
                    System.out.println("Número inválido. Por favor, introduce un número entre 1 y 49.");
                }
            }
        }

        // Comparar los números del usuario con los del boleto ganador
        boletoGanador.compararNumeroBoleto(numeroUsuario);
    }

    public static class Primitiva {
        private int[] numeroBoleto = new int[6];

        // Método para generar el número del boleto ganador
        public void generarNumeroBoleto() {
            Random random = new Random();
            ArrayList<Integer> numerosGenerados = new ArrayList<>();

            int i = 0;
            while (i < numeroBoleto.length) {
                int numAleatorio = random.nextInt(49) + 1; // Genera un número aleatorio entre 1 y 49
                if (!numerosGenerados.contains(numAleatorio)) { // Verifica si es único
                    numerosGenerados.add(numAleatorio); // Añade el número a la lista
                    numeroBoleto[i] = numAleatorio;
                    i++;
                }
            }

            System.out.println("Números del boleto ganador: " + Arrays.toString(numeroBoleto));
        }

        // Método para comparar el boleto del usuario con el boleto ganador
        public void compararNumeroBoleto(int[] boletoUsuario) {
            ArrayList<Integer> numerosGanadores = new ArrayList<>();
            for (int numero : numeroBoleto) {
                numerosGanadores.add(numero);
            }

            int aciertos = 0;
            for (int numero : boletoUsuario) {
                if (numerosGanadores.contains(numero)) { // Busca si el número está en la lista
                    aciertos++;
                }
            }

            System.out.println("Tu boleto: " + Arrays.toString(boletoUsuario));
            System.out.println("La cantidad de números acertados de tu boleto es: " + aciertos);
        }
    }
}
