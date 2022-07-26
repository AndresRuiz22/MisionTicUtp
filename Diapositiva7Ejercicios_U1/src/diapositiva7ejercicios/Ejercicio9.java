package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");  
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad: ");  
        int edad = sc.nextInt();
        System.out.println("Ingrese el salario: ");  
        double salario = sc.nextDouble();
        
        if(edad<16){
            System.out.println("No tiene edad para trabajar");
        }
        else if(edad>=19 && edad<=50){
            salario += salario*0.05;
        }
        else if(edad>=51 && edad<=60){
            salario += salario*0.1;
        }
        else if(edad>60){
            salario += salario*0.15;
        }
        System.out.println("El salario del trabajador "+ nombre+ " es "+ salario);
    }

}
