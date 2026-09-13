import java.util.Scanner;

public class IntercambiarFilas {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de filas: ");
            int cantidad_filas = teclado.nextInt();
            
            System.out.print("Ingrese la cantidad de columnas: ");
            int cantidad_columnas = teclado.nextInt();
            
            int[][] matriz = new int[cantidad_filas][cantidad_columnas];
            
            // Rellenar la matriz con números aleatorios entre 1 y 100
            for (int fila = 0; fila < cantidad_filas; fila++) {
                for (int columna = 0; columna < cantidad_columnas; columna++) {
                    matriz[fila][columna] = (int) (Math.random() * 100) + 1;
                }
            }
            
            // Intercambiar la primera fila con la segunda
            for (int columna = 0; columna < cantidad_columnas; columna++) {

                int temporal = matriz[0][columna];
                matriz[0][columna] = matriz[1][columna];
                matriz[1][columna] = temporal;
            }

            // Imprimir la matriz
            System.out.println("\nMatriz después del intercambio:");
            
            for (int fila = 0; fila < cantidad_filas; fila++) {
                for (int columna = 0; columna < cantidad_columnas; columna++) {
                    System.out.print(matriz[fila][columna] + "\t");
                }
                System.out.println();
            }
        }
    }
}