package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int serie = sc.nextInt();
        int suma = 1;
        int num1 = 0;
        int num2 = 1;
        
        while (serie >= suma){
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
            
    }
}
