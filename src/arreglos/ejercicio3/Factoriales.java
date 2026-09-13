package arreglos.ejercicio3;

import java.util.Scanner;

public class Factoriales {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("¿Cuántos números desea ingresar?: ");
            int cantidad_numeros = teclado.nextInt();
            
            int[] numeros = new int[cantidad_numeros];
            long[] factoriales = new long[cantidad_numeros];
            
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                
                System.out.print("Ingrese un número: ");
                numeros[posicion] = teclado.nextInt();
                
                long factorial = 1;
                
                for (int numero = 1; numero <= numeros[posicion]; numero++) {
                    factorial *= numero;
                }
                
                factoriales[posicion] = factorial;
            }
            
            System.out.println("\nNúmeros iniciales:");
            
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.print(numeros[posicion] + " ");
            }
            
            System.out.println("\n\nFactoriales:");
            
            for (int posicion = 0; posicion < factoriales.length; posicion++) {
                System.out.print(factoriales[posicion] + " ");
            }
        }
    }
}