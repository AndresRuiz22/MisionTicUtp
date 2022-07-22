import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");

        var numero = sc.nextInt();

        String dig = String.valueOf(numero);
        System.out.println("El numero de digitos es: " + dig.length());

    }
}
