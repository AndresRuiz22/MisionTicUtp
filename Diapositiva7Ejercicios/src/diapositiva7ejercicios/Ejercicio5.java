
package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        int num = sc.nextInt();
        int aleatorio = (int) Math.floor(Math.random()*(100-1+1)+1);
        

        while(num!=aleatorio){
            if (num<aleatorio){
                System.out.println("El numero que busca es mayor");
                System.out.println("Por favor ingrese un numero: ");
                num = sc.nextInt();
            }
            else if(num>aleatorio){
                System.out.println("El numero que busca es menor");
                System.out.println("Por favor ingrese un numero: ");
                num = sc.nextInt();
            }
        }
        System.out.println("Has encontrado el numero");
    }
    
}
