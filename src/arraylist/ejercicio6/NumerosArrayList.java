package arraylist.ejercicio6;

import java.util.ArrayList;

public class NumerosArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        int suma = 0;
        int numero;

        do {
            numero = (int) (Math.random() * 21) - 10;

            if (numero != 10) {
                numeros.add(numero);
                suma += numero;
            }

        } while (numero != 10);

        System.out.println("Números leídos:");

        for (int posicion = 0; posicion < numeros.size(); posicion++) {
            System.out.print(numeros.get(posicion) + " ");
        }

        double media = (double) suma / numeros.size();

        System.out.println("\n\nSuma: " + suma);
        System.out.println("Media: " + media);
    }
}