package comodines;

public class Primos {

    //clase para determinar si un numero es primo

    public static boolean es_primo(int numero){
        if(numero<=1){
            return false;
        }

        for(int i=2; i <= Math.sqrt(numero);i++){
            if(numero%i == 0){
                return false;
            }
        }
        return true;
    }
}
