package arraylist.ejercicio8;

import java.util.ArrayList;

public class FrecuenciaNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar 100 números aleatorios entre 1 y 20
        for (int posicion = 0; posicion < 100; posicion++) {
            int numero_aleatorio = (int) (Math.random() * 20) + 1;
            numeros.add(numero_aleatorio);
        }

        // Imprimir la lista
        System.out.println("ArrayList:");
        System.out.println(numeros);

        int numero_mayor_frecuencia = 0;
        int mayor_frecuencia = 0;

        // Tabla
        System.out.println("\nNúmero\tFrecuencia");
        System.out.println("------------------");

        for (int numero = 1; numero <= 20; numero++) {

            int frecuencia = 0;

            // Recorrer el ArrayList para contar
            for (int posicion = 0; posicion < numeros.size(); posicion++) {

                if (numeros.get(posicion) == numero) {
                    frecuencia++;
                }
            }

            System.out.println(numero + "\t" + frecuencia);

            // Determinar el número con mayor frecuencia
            if (frecuencia > mayor_frecuencia) {
                mayor_frecuencia = frecuencia;
                numero_mayor_frecuencia = numero;
            }
        }

        System.out.println("\nNúmero que más se repite: " + numero_mayor_frecuencia);
        System.out.println("Frecuencia: " + mayor_frecuencia);
    }
}