package pr.ellt07;

import java.util.Arrays;

public class ELLt07 {
    /*Bloque A: Array
    Cuestiones:
    Ejecuta estas porciones de código y responde a las cuestiones:*/
    public static void main(String[] args) {

        /*a) Indica los errores del siguiente código y muestre lo que saca por pantalla:
            int[] a = new int[]{10, 21, 37, 40, 51}; //Array de 4 posiciones 
            int p = 0, i = 0; //Variables enteras que repesentan la acumulacion de pares e impares

            //bucle que separa los numeros pares e impares en un if-else
            for (int x = 0; x < a.length; x++) {
                if (x % 2 == 0) {
                    p += a[x]; //suma las posiciones pares dentro del array 
                } else {
                    i += a[x]; //suma las posicones impares dentro del array
                }
            }
        System.out.printf("%d-%d\n", p, i);// muestra los numeros impares 
        //muestra le contenido de Array "a"
        //import java.util.arrays
        System.out.println(Arrays.toString(a));  
    }/*
        //b) Indica los errores de cada línea:
            /*a) Esta mal creada el array de indicar el tipo de dato al final 
            int[] arr = new arr[]{10, 20, 30, 40, 50};*/
        //int[] arr = new int[]{10, 20, 30, 40, 50};
        /*b) No se debe indica el tamaño del array al principio del array
            int [5] arr = new int [] {10,20,30,40,50};*/
        //int [] arr = new int [] {10,20,30,40,50};
        /*c) No se puede indicar al final el tamaño del array 
            int [] arr = new int [5] {10,20,30,40,50};*/
        //int [] arr = new int [] {10,20,30,40,50};
        /*d) Este array no esta mla declarado
            int [] arr = new int [] {10,20,30,40,50};*/
 /*e) Esta declarado un array vacio 
            int [] arr = new int [5]; */
 /*c) Corrige los errores de este código e indica la salida del mismo:
            int [] arr = new int [] {10,20,30,40,50};
            // Metodo length sin parentesis + incremento mal declarado 
            for (int i=0; i<= arr.length()-1;i=+1) 
                arr[i]=arr[i+1];// Incremento mal declarado --> Exception 
            System.out.println(Arrays.toString(arr));*/

 /*int [] arr = new int [] {10,20,30,40,50};
            
            for (int i=0; i<= arr.length-1;i++) // Metodo length sin parentesis
                arr[i]=arr[i];
            System.out.println(Arrays.toString(arr));*/
 /*d) Indica que muestra este código y corrige los errores que encuentres:  
                int [] arr = new int [] {10,20,30,40,50};
                    System.out.println(Arrays.toString(fun (arr)));
                }
            static int [] fun (int [] x ){
                int [] y = new int[x.length*2];   
                int cont=0;
                
                for (int z : x){
                    y[cont++]=z ;
                    y[cont++]=z+10;
                }
            return y;
        }*/
    }

    /*e) Dado el siguiente programa en Java:*/
    /*
        ej abc abc abc 
            ej abc abc 
            ej ABc abc 
    */
    /*public class ej {
        public static void main(String[] args) {
            boolean result = true;
        
            if (args.length != 2) {
                result = false;
            } else if (!args[0].equals(args[1])) {
                result = false;
            }
            System.out.println(result);
        }
    }*/
    
    /*f) Indica qué hace este programa.*/ 
        /*boolean result=true;
            if (args.length != 2) result=false; // si los argumento de mian  distinto de 2 = false
            else if (!args[0].equals(args[1])) result= false;
            else { int up=0, low=0;
        for (int i=0;i<args[0].length();i++){
            if (Character.isUpperCase(args[0].charAt(i))) up++;
            else if (Character.isLowerCase(args[0].charAt(i))) low++;
            }
            if (low <= 1 || up <= 1 ) result = false;
        }
        System.out.println (result);*/
    
}
