
package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese numero de horas trabajadas al mes: ");
        int horas = sc.nextInt();
        
        System.out.println("El sueldo del trabajador es: $"+ horas*30000);
    }
}
