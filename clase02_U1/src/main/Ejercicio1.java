package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        numSuerte();
        
    }

    public static int numSuerte(){
        Scanner solicitud = new Scanner (System.in);
        System.out.println("Por favor digite el numero del dia de nacimiento: ");
        int dia = solicitud.nextInt();
        System.out.println("Por favor digite el numero del mes de nacimiento:");
        int mes = solicitud.nextInt();
        System.out.println("Por favor digite el numero del año de nacimiento: ");
        int año = solicitud.nextInt();

        int sumaNac = dia + mes + año;
        int contador = 0;
        int contador2 = sumaNac;
        for(int i=0; i<String.valueOf(sumaNac).length(); i++){
            contador += contador2%10;
            contador2/=10;
        }
        System.out.println("El numero de la suerte es: " + contador);
        return contador;
        
    }
    

}

