
package pr.ellt07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e5_SorteoA {
    public static void main(String[] args) {
           // Programa que el usuario introduzca los 6 números de su boleto y le diga cuántos acertó.
        Primitiva boletoGanador = new Primitiva();
        boletoGanador.generarNumeroBoleto();

        // Solicitar al usuario que introduzca sus números
        int[] numeroUsuario = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los 6 números de tu boleto (entre 1 y 49):");
        for (int i = 0; i < numeroUsuario.length; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                if (numero < 1 || numero > 49) {
                    System.out.println("Numero inválido. Por favor, introduce un número entre 1 y 49.");
                }
            } while (numero < 1 || numero > 49);
            numeroUsuario[i] = numero;
        }

        // Comparar los números del usuario con los del boleto ganador
        boletoGanador.compararNumeroBoleto(numeroUsuario);
    }

 public static class Primitiva {
        private int[] numeroBoleto = new int[6];

        // Método para generar el número del boleto ganador
        public void generarNumeroBoleto() {
            Random random = new Random();
            boolean[] numerosUsados = new boolean[49]; // Para verificar si un número ya fue usado
            int i = 0;

            while (i < numeroBoleto.length) {
                int numAleatorio = random.nextInt(49); // Genera un número aleatorio entre 0 y 48
                if (!numerosUsados[numAleatorio]) { // Verifica si el número ya fue usado
                    numerosUsados[numAleatorio] = true; // Marca el número como usado
                    numeroBoleto[i] = numAleatorio + 1; // Lo asigna al array (entre 1 y 49)
                    i++;
                }
            }

            System.out.println("Numeros del boleto ganador: " + Arrays.toString(numeroBoleto));
        }

        // Método para comparar el boleto del usuario con el boleto ganador
        public void compararNumeroBoleto(int[] boletoUsuario) {
            int aciertos = 0;

            System.out.println("Comparando tu boleto: " + Arrays.toString(boletoUsuario));
            for (int i = 0; i < boletoUsuario.length; i++) {
                boolean encontrado = false;
                for (int j = 0; j < numeroBoleto.length; j++) {
                    if (boletoUsuario[i] == this.numeroBoleto[j]) {
                        encontrado = true;
                        break;
                    }
                }
                
                if (encontrado) {
                    aciertos++;
                }
            }

            System.out.println("La cantidad de numeros acertados de tu boleto es: " + aciertos);
        }
    }
}


