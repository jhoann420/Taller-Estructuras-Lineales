package matrices.ejercicio11;

import java.util.Scanner;

public class BuscarEnMatriz {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el número de filas: ");
            int cantidad_filas = teclado.nextInt();

            System.out.print("Ingrese el número de columnas: ");
            int cantidad_columnas = teclado.nextInt();

            int[][] matriz = new int[cantidad_filas][cantidad_columnas];

            // Rellenar la matriz con números aleatorios entre 1 y 100
            for (int fila = 0; fila < cantidad_filas; fila++) {
                for (int columna = 0; columna < cantidad_columnas; columna++) {
                    matriz[fila][columna] = (int) (Math.random() * 100) + 1;
                }
            }

            // Imprimir la matriz
            System.out.println("\nMatriz:");

            for (int fila = 0; fila < cantidad_filas; fila++) {
                for (int columna = 0; columna < cantidad_columnas; columna++) {
                    System.out.print(matriz[fila][columna] + "\t");
                }
                System.out.println();
            }

            // Leer el número que se desea buscar
            System.out.print("\nIngrese el número que desea buscar: ");
            int numero_buscado = teclado.nextInt();

            boolean encontrado = false;

            // Buscar la primera ocurrencia
            for (int fila = 0; fila < cantidad_filas && !encontrado; fila++) {

                for (int columna = 0; columna < cantidad_columnas; columna++) {

                    if (matriz[fila][columna] == numero_buscado) {

                        System.out.println(
                            "El número " + numero_buscado +
                            " se encuentra en la posición [" +
                            fila + "][" + columna + "]"
                        );

                        encontrado = true;
                        break;
                    }
                }
            }

            // Si no se encontró
            if (!encontrado) {
                System.out.println("El número " + numero_buscado + " no se encuentra en la matriz.");
            }

            teclado.close();
        }
    }
}