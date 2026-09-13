package arreglos.ejercicio1;

public class ArregloNumerosPrimos {
    
    public static void imprimir_primos(){

        int[] primeros_diez_primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        
        for(int i = 0; i<=primeros_diez_primos.length; i++){
            System.out.println(primeros_diez_primos[i]+" ");
        }

    }

    public static void main(String[] args) {
        imprimir_primos();
    }

}
