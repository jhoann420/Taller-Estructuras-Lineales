package arreglos.ejercicio2;


public class PrimerosCienPares {

    static int[] pares = new int[100];

    public static void imprimir_primeros_cien_pares_una_linea(){

        for(int i = 0; i<=pares.length; i++){
            pares[i] = (i+1)*2;
            System.out.print(pares[i]+" ");
        }
    }

    public static void imprimir_primeros_cien_pares_por_filas(){

        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }

        for (int i = 0; i < pares.length; i++) {

            if (i % 10 == 0) {
                System.out.print("Línea " + ((i / 10) + 1) + ": ");
            }

            System.out.print(pares[i] + " ");

            if (i % 10 == 9) {
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
        //imprimir_primeros_cien_pares_una_linea();
        imprimir_primeros_cien_pares_por_filas();
    }
}
