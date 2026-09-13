package matrices.ejercicio12;

import java.util.Scanner;

public class DiagonalOpuesta {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño de la matriz: ");
            int n = teclado.nextInt();
            
            int[][] matriz = new int[n][n];
            
            // Rellenar la matriz con números aleatorios entre -50 y 50
            for (int fila = 0; fila < n; fila++) {
                for (int columna = 0; columna < n; columna++) {
                    matriz[fila][columna] = (int) (Math.random() * 101) - 50;
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

            // Calcular la sumatoria de la diagonal secundaria
            int suma = 0;
            
            for (int fila = 0; fila < n; fila++) {
                suma += matriz[fila][n - 1 - fila];
            }
            
            System.out.println("\nSumatoria de la diagonal opuesta: " + suma);
        }
    }
}