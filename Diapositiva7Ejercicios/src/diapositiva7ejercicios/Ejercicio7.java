package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        char respuesta = 'S';
        while (respuesta == 'S') {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor ingrese un numero: ");
            int num = sc.nextInt();
            int contador = 0;

            for (int i = 1; i <= num / 2; ++i) {
                if (num % i == 0) {
                    contador += 1;
                }
            }
            if (contador != 1) {
                System.out.println("No es primo, ¿desea escribir otro numero? (S/N)");
            } else {
                System.out.println("Es primo, ¿desea escribir otro numero? (S/N)");
            }
            respuesta = sc.next().charAt(0);
        }

    }
}
