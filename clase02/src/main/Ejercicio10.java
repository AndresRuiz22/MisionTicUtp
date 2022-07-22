package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        System.out.println(horaValida());
        
    }
    public static String horaValida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora: ");
        int hora = sc.nextInt();
        System.out.println("Ingrese los minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Ingrese los segundos: ");
        int segundos = sc.nextInt();
        String respuesta;

        if(hora<0 || hora>24 || minutos<0 || minutos>60 || segundos<0 || segundos>60){
            respuesta = "Hora no valida";
        }
        else{
            respuesta = "Hora valida";
        }
        return respuesta;
    }
}
