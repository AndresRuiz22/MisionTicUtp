
package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su sexo (H/M): ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese su altura en cm: ");
        int altura = sc.nextInt();
        
        if (sexo=='H'){
            System.out.println("Su peso ideal es: " + (altura-120));
        }
        else{
            System.out.println("Su peso ideal es: " + (altura-110));
        }
        
    }
}
