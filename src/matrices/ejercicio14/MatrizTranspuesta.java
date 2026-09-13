package matrices.ejercicio14;

public class MatrizTranspuesta {

    public static void main(String[] args) {

        
        // Matriz de 3 filas por 4 columnas
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // La transpuesta tendrá columnas x filas
        int[][] transpuesta = new int[columnas][filas];

        // Encontrar la transpuesta
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }

        // Imprimir matriz original
        System.out.println("Matriz original:");

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Imprimir matriz transpuesta
        System.out.println("\nMatriz transpuesta:");

        for (int[] transpuesta1 : transpuesta) {
            for (int columna = 0; columna < transpuesta[0].length; columna++) {
                System.out.print(transpuesta1[columna] + "\t");
            }
            System.out.println();
        }
    }
}