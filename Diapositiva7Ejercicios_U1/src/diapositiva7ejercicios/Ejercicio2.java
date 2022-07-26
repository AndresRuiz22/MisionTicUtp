
package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del alumno: ");
        String alumno = sc.nextLine();
        System.out.println("Por favor ingrese la nota de la evaluacion 1: ");
        double eval1 = sc.nextDouble();
        System.out.println("Por favor ingrese la nota de la evalucion 2: ");
        double eval2 = sc.nextDouble();
        System.out.println("Por favor ingrese la nota de la evaluacion 3: ");
        double eval3 = sc.nextDouble();
        
        double prom = (eval1 + eval2 +eval3)/3;
        
        if (prom >= 3){
            System.out.println("El alumno "+ alumno + " esta aprobado");
        }
        else{
            System.out.println("El alumno "+ alumno + " esta reprobado");
        }
    }
}
