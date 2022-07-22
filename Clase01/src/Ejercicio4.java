import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese los grados celsius: ");
        var celsius = sc.nextInt();

        int farenheit = 32 + (9*celsius/5);
        System.out.println("Los grados farenheit son: " + farenheit);
    }
}
