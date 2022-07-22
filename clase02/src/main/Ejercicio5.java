package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
       System.out.println(longitudHipotenusa()); 
    }
    public static double longitudHipotenusa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la longitud en cm del cateto 1: ");
        double cateto1 = sc.nextDouble();
        System.out.println("Por favor ingrese la longitud en cm del cateto 2: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt((Math.pow(cateto1, 2))+(Math.pow(cateto2, 2)));
        
        return hipotenusa;
    }
}
