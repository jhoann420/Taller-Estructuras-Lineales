package arreglos.ejercicio5;

public class InvertirNumeros {
    
     public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] numeros_invertidos = new int[20];

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            numeros[posicion] = (int) (Math.random() * 1000);
        }

        for (int posicion = 0; posicion < numeros.length; posicion++) {

            int numero = numeros[posicion];
            int numero_invertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                numero_invertido = numero_invertido * 10 + digito;
                numero = numero / 10;
            }

            numeros_invertidos[posicion] = numero_invertido;
        }

        System.out.println("Arreglo original:");

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            System.out.print(numeros[posicion] + " ");
        }

        System.out.println("\n\nArreglo invertido:");

        for (int posicion = 0; posicion < numeros_invertidos.length; posicion++) {
            System.out.print(numeros_invertidos[posicion] + " ");
        }
    }
}
