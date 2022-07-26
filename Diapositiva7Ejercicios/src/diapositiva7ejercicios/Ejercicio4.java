
package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int tabla = sc.nextInt();
        
        for (int i=0; i<11; i++){
            System.out.println(tabla*i);
        }
    }
}
