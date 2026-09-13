package matrices.ejercicio13;

import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño de la matriz: ");
            int n = teclado.nextInt();

            int[][] matriz = new int[n][n];

            // Rellenar la matriz con números aleatorios entre 1 y 100
            for (int fila = 0; fila < n; fila++) {
                for (int columna = 0; columna < n; columna++) {
                    matriz[fila][columna] = (int) (Math.random() * 100) + 1;
                }
            }

            // Imprimir la matriz
            System.out.println("\nMatriz:");

            for (int fila = 0; fila < n; fila++) {
                for (int columna = 0; columna < n; columna++) {
                    System.out.print(matriz[fila][columna] + "\t");
                }
                System.out.println();
            }

            // Determinar si es simétrica
            boolean simetrica = true;

            for (int fila = 0; fila < n; fila++) {
                for (int columna = 0; columna < n; columna++) {

                    if (matriz[fila][columna] != matriz[columna][fila]) {
                        simetrica = false;
                        break;
                    }
                }

                if (!simetrica) {
                    break;
                }
            }

            if (simetrica) {
                System.out.println("\nLa matriz es simétrica.");
            } else {
                System.out.println("\nLa matriz no es simétrica.");
            }

            // Imprimir las esquinas
            System.out.println("\nEsquinas de la matriz:");
            System.out.println("Esquina superior izquierda: " + matriz[0][0]);
            System.out.println("Esquina superior derecha: " + matriz[0][n - 1]);
            System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
            System.out.println("Esquina inferior derecha: " + matriz[n - 1][n - 1]);

            teclado.close();
        }
    }
}
