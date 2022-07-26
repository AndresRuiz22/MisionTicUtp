package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(KmtoM());
    }

    public static double KmtoM() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite la velocidad en km/h que desea convertir: ");
        double velocidad = sc.nextDouble();

        double conversion = velocidad * 1000 / 3600;

        return conversion;

    }
}
