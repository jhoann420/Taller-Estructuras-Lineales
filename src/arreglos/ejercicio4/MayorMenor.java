package arreglos.ejercicio4;

public class MayorMenor {

    public static void main(String[] args) {

        int[] numeros = new int[25];

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            numeros[posicion] = (int) (Math.random() * 101) - 50;
        }

        int numero_menor = numeros[0];
        int numero_mayor = numeros[0];

        for (int posicion = 1; posicion < numeros.length; posicion++) {

            if (numeros[posicion] < numero_menor) {
                numero_menor = numeros[posicion];
            }

            if (numeros[posicion] > numero_mayor) {
                numero_mayor = numeros[posicion];
            }
        }

        System.out.println("Arreglo:");

        for (int posicion = 0; posicion < numeros.length; posicion++) {
            System.out.print(numeros[posicion] + " ");
        }

        System.out.println("\n\nNúmero menor: " + numero_menor);
        System.out.println("Número mayor: " + numero_mayor);
    }
}