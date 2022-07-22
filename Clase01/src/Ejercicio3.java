import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese le numero: ");
        var num = sc.nextInt();

        int doble = num*2;
        int triple = num*3;

        System.out.println("El doble del numero es: "+ doble);
        System.out.println("El triple del numero es: "+ triple);
    }
} 
      
    

