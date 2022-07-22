package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ejercicio9 {
    public static void main(String[] args){
        System.out.println(numMayor());
    }

    public static String numMayor() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println("Por favor ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Por favor ingrese el tercer numero: ");
        int n3 = sc.nextInt();  

        String mayor;

        if (n1>n2 && n1>n3){
            mayor = "El numero mayor es: " + n1;
        }
        else if (n2>n3 && n2>n1){
            mayor = "El numero mayor es: " + n2;        
        }
        else if (n3>n1 && n3>n2){
            mayor = "El numero mayor es: " + n3;
        }
        else {
            mayor = "No hay numero mayor";        
        }
        
        return mayor;
    }
}