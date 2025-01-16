package pr.ellt07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e4_Array_Operaciones_Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Meses[] ObjetosMeses = new Meses[12]; 
        
        Meses Enero = new Meses (1,"Enero"); 
        Meses Febrero = new Meses (2,"Febrero");
        Meses Marzo = new Meses (3,"Febrero");
        Meses Abril = new Meses (4,"Febrero");
        Meses Mayo = new Meses (5,"Mayo");
        Meses Junio = new Meses (6,"Junio");
        Meses Julio = new Meses (7,"Julio");
        Meses Agosto = new Meses (8,"Agosto");
        Meses Septiembre = new Meses (9,"Septiembre");
        Meses Octubre = new Meses (10,"Octubre");
        Meses Noviembre = new Meses (11,"Noviembre");
        Meses Diciembre = new Meses (12,"Diciembre");
       
        ObjetosMeses[0]=Enero;
        ObjetosMeses[1]=Febrero;
        ObjetosMeses[2]=Marzo;
        ObjetosMeses[3]=Abril;
        ObjetosMeses[4]=Mayo;
        ObjetosMeses[5]=Junio;
        ObjetosMeses[6]=Julio;
        ObjetosMeses[7]=Agosto;
        ObjetosMeses[8]=Septiembre;
        ObjetosMeses[9]=Octubre;
        ObjetosMeses[10]=Noviembre;
        ObjetosMeses[11]=Diciembre;
        
        
        int[] temperaturaMeses = new int[12];

        int opcion = 0; // Inicializar la opción antes del bucle
        while (opcion != 6) {
            System.out.println("---------------------");
            System.out.println("1. Rellenar Array");
            System.out.println("2. Mostrar Nombres");
            System.out.println("3. Temperatura Con Formato");
            System.out.println("4. Mes Frio Max");
            System.out.println("5. Desplazar Posiciones");
            System.out.println("6. Salir.");
            System.out.println("---------------------");

            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt(); // Leer la nueva opción del usuario
            System.out.println("---------------------");
            switch (opcion) {
                case 1 -> {
                    RellenarAleatorio(temperaturaMeses);
                }
                case 2 -> {
                    MostrarNombres(ObjetosMeses);
                }
                case 3 -> {
                    TemperaturaConFormato(temperaturaMeses);
                }
                case 4 -> {
                    MesFrioMax(temperaturaMeses);
                }
                case 5 -> {
                    DesplazarPosiciones(temperaturaMeses);

                }
                case 6 -> {
                    System.out.println("Has salido!");
                }
                default ->
                    System.out.println("Opcion invalida.");
            }
        }
    }

    public static void RellenarAleatorio(int[] miArray) {
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

    public static void MostrarNombres(Meses[] miArray) {
        for (int j = 0; j < miArray.length; j++) {
            System.out.println(miArray[j].nombre);
        }
    }

    public static void TemperaturaConFormato(int[] miArray) {
        
        
    }

    public static void MesFrioMax(int[] miArray) {

    }

    public static void DesplazarPosiciones(int[] miArray) {

    }

    public static class Meses {
        private int nro_mes;
        private String nombre;
        private int temperatuta;
        private String observaciones;
        public Meses(int nro_mes, String nombre) {
            this.nro_mes=nro_mes;
            this.nombre=nombre;
            this.temperatuta=0;
            this.observaciones="Por defecto";
        }
        
        public int getNro_mes() {
            return nro_mes;
        }

        public String getNombre() {
            return nombre;
        }
    }
}
