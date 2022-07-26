package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        precioVenta();
    }

    public static double precioVenta() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor digite el precio del producto (sin iva): ");
        double precioU = sc.nextDouble();
        System.out.println("Por favor digite la cantidad vendidad del producto: ");
        double cantidad = sc.nextDouble(); 
        System.out.println("Por favor digite el porcentaje de iva aplicado:  ");
        double iva = sc.nextDouble();

        double totalventa = (precioU*cantidad)+(precioU*cantidad*iva); 
        System.out.println("El precio total de venta es: "+ totalventa);
        return totalventa;
    }
}
