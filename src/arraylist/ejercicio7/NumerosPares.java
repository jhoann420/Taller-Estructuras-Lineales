package arraylist.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            ArrayList<Integer> numeros = new ArrayList<>();

            // Inicializar los 20 primeros números pares
            for (int numero = 2; numero <= 40; numero += 2) {
                numeros.add(numero);
            }

            // Imprimir el ArrayList inicial
            System.out.println("ArrayList inicial:");
            System.out.println(numeros);

            // Leer número para insertar
            System.out.print("Ingrese un número: ");
            int numero_nuevo = teclado.nextInt();

            // Buscar la posición correcta
            int posicion = 0;

            while (posicion < numeros.size() && numeros.get(posicion) < numero_nuevo) {
                posicion++;
            }

            // Insertar en la posición encontrada
            numeros.add(posicion, numero_nuevo);

            // Imprimir ArrayList después de insertar
            System.out.println("ArrayList después de insertar:");
            System.out.println(numeros);

            // Leer número para eliminar
            System.out.print("Ingrese el número que desea borrar: ");
            int numero_borrar = teclado.nextInt();

            // Eliminar el número
            numeros.remove(Integer.valueOf(numero_borrar));

            // Imprimir ArrayList después de eliminar
            System.out.println("ArrayList después de borrar:");
            System.out.println(numeros);

            teclado.close();
        }
    }
}
