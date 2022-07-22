package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("El resultado de la division es: " + division());
    }

    public static double division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero diferente de 0: ");
        double n2 = sc.nextDouble();
        while (n2==0){
            System.out.println("Ingrese el segundo numero diferente de 0: ");
            n2 = sc.nextDouble();
        }

        double resultado = n1/n2;

        return resultado;
    }
}
