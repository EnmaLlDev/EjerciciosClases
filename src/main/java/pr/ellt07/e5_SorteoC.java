package pr.ellt07;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class e5_SorteoC {

    public class LoteriaSinSet {

        public static void main(String[] args) {
            Random random = new Random();

            // Generar el boleto ganador
            int[] boletoGanador = generarBoleto(random);
            System.out.println("Boleto ganador: " + Arrays.toString(boletoGanador));

            // Inicializar variables
            int[] boletoActual;
            int contadorBoletos = 0;

            // Generar boletos hasta acertar
            do {
                boletoActual = generarBoleto(random);
                contadorBoletos++;
            } while (!Arrays.equals(boletoActual, boletoGanador));

            // Resultado
            System.out.println("Número de boletos generados: " + contadorBoletos);
            System.out.println("¡Boleto acertado!: " + Arrays.toString(boletoActual));
        }

        // Método para generar un boleto con 6 números únicos entre 1 y 49
        public static int[] generarBoleto(Random random) {
            int[] plazas = new int[6];
            int indice = 0;

            while (indice < 6) {
                int numero = random.nextInt(49) + 1; // Generar número entre 1 y 49
                if (!contiene(plazas, numero, indice)) {
                    plazas[indice] = numero;
                    indice++;
                }
            }

            Arrays.sort(plazas); // Ordenar el boleto para facilitar la comparación
            return plazas;
        }

        // Método para verificar si un número ya está en el boleto
        public static boolean contiene(int[] boleto, int numero, int limite) {
            for (int i = 0; i < limite; i++) {
                if (boleto[i] == numero) {
                    return true;
                }
            }
            return false;
        }
    }
}
