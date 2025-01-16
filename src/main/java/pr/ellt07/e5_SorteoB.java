
package pr.ellt07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e5_SorteoB {

    public static void main(String[] args) {
        Primitiva boletoGanador = new Primitiva();
        boletoGanador.generarNumeroBoleto();

        // Contadores para boletos con 3, 4, 5 y 6 aciertos
        int boletosCon3Aciertos = 0;
        int boletosCon4Aciertos = 0;
        int boletosCon5Aciertos = 0;
        int boletosCon6Aciertos = 0;

        // Generar 1000 boletos aleatorios y contar los aciertos
        for (int i = 0; i < 1000; i++) {
            int[] boletoAleatorio = boletoGanador.generarBoletoAleatorio();
            int aciertos = boletoGanador.calcularAciertos(boletoAleatorio);

            switch (aciertos) {
                case 3 -> boletosCon3Aciertos++;
                case 4 -> boletosCon4Aciertos++;
                case 5 -> boletosCon5Aciertos++;
                case 6 -> boletosCon6Aciertos++;
            }
        }

        // Mostrar los resultados
        System.out.println("Resultados tras generar 1000 boletos:");
        System.out.println("Boletos con 3 aciertos: " + boletosCon3Aciertos);
        System.out.println("Boletos con 4 aciertos: " + boletosCon4Aciertos);
        System.out.println("Boletos con 5 aciertos: " + boletosCon5Aciertos);
        System.out.println("Boletos con 6 aciertos: " + boletosCon6Aciertos);
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

        // Método para generar un boleto aleatorio
        public int[] generarBoletoAleatorio() {
            Random random = new Random();
            ArrayList<Integer> numerosGenerados = new ArrayList<>();
            int[] boletoAleatorio = new int[6];

            int i = 0;
            while (i < boletoAleatorio.length) {
                int numAleatorio = random.nextInt(49) + 1; // Genera un número aleatorio entre 1 y 49
                if (!numerosGenerados.contains(numAleatorio)) { // Verifica si es único
                    numerosGenerados.add(numAleatorio); // Añade el número a la lista
                    boletoAleatorio[i] = numAleatorio;
                    i++;
                }
            }

            return boletoAleatorio;
        }

        // Método para calcular cuántos números acertó un boleto
        public int calcularAciertos(int[] boletoUsuario) {
            int aciertos = 0;
            for (int numero : boletoUsuario) {
                for (int ganador : numeroBoleto) {
                    if (numero == ganador) {
                        aciertos++;
                        break;
                    }
                }
            }
            return aciertos;
        }
    }
}
