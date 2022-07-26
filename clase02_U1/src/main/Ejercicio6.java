package co.edu.utp.misiontic2022.c2;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(multiploDeDiez(95));
    }
    
    public static String multiploDeDiez(int numero){
        String mensaje;
        if(numero%10==0){
            mensaje = "Es multiplo de diez";
        }
        else{
            mensaje = "No es multiplo de diez";
        }
        return mensaje;
    }
}

