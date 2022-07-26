package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public double sumar(double num1, double num2) {
        double suma = num1 + num2;
        return suma;
    }

    public double restar(double num1, double num2) {
        double resta = num1 - num2;
        return resta;
    }

    public double multiplicar(double num1, double num2) {
        double multi = num1 * num2;
        return multi;
    }

    public double dividir(double num1, double num2) {
        double division = num1 / num2;
        return division;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite el primer numero: ");
        double n1 = sc.nextInt();
        System.out.println("Por favor digite el segundo numero: ");
        double n2 = sc.nextInt();

        Ejercicio1 resultado1 = new Ejercicio1();

        System.out.println("La suma de " + n1 + " y " + n2 + " es igual a " + resultado1.sumar(n1, n2));
        System.out.println("La resta de " + n1 + " y " + n2 + " es igual a " + resultado1.restar(n1, n2));
        System.out.println("La multiplicacion de " + n1 + " y " + n2 + " es igual a " + resultado1.multiplicar(n1, n2));
        System.out.println("La division de " + n1 + " y " + n2 + " es igual a " + resultado1.dividir(n1, n2));
    }
}
