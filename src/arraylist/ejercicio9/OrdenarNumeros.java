package arraylist.ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros_pares = new ArrayList<>();
        ArrayList<Integer> numeros_impares = new ArrayList<>();

        // Generar 20 números aleatorios entre 1 y 100
        for (int posicion = 0; posicion < 20; posicion++) {
            int numero_aleatorio = (int) (Math.random() * 100) + 1;
            numeros.add(numero_aleatorio);
        }

        // Lista original
        System.out.println("Lista original:");
        System.out.println(numeros);

        // Ordenar de menor a mayor
        Collections.sort(numeros);

        System.out.println("\nDe menor a mayor:");
        System.out.println(numeros);

        // Ordenar de mayor a menor
        Collections.reverse(numeros);

        System.out.println("\nDe mayor a menor:");
        System.out.println(numeros);

        // Separar pares e impares
        for (int posicion = 0; posicion < numeros.size(); posicion++) {

            if (numeros.get(posicion) % 2 == 0) {
                numeros_pares.add(numeros.get(posicion));
            } else {
                numeros_impares.add(numeros.get(posicion));
            }
        }

        // Mostrar listas
        System.out.println("\nNúmeros pares:");
        System.out.println(numeros_pares);

        System.out.println("\nNúmeros impares:");
        System.out.println(numeros_impares);
    }
}