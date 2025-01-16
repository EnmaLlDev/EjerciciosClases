package pr.ellt07;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

public class e6_Parking {

    public static void main(String[] args) {
        int plazas_disponibles = 0;
        int plazas_ocupadas = 0;
    }

    public static class Parking {

        private String[] plazasDisponibles;

        public Parking() {
            this.plazasDisponibles = new String[20];
        }

        public String[] getPlazasDisponibles() {
            return plazasDisponibles;
        }

        public void setPlazasDisponibles(String[] plazasDisponibles) {
            this.plazasDisponibles = plazasDisponibles;
        }

        public int GenerarMatricula() {
            int[] matricula = new int[6];
            int indice = 0;

            while (indice < 6) {
                Random random = new Random();
                int numero = random.nextInt(49) + 1; // Generar número entre 1 y 49
                if (!contiens(matricula, numero, indice)) {
                    matricula[indice] = numero;
                    indice++;
                }
            }

            Arrays.sort(matricula); // Ordenar el boleto para facilitar la comparación
            return matricula;
        }

        public void MostrarEstado(int[] ArrayCoches) {
            int contador = 0;
            for (int i = 0; i <= 20; i++) {
            }
        }

        public void ActualizarPlazas() {

        }
        
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
