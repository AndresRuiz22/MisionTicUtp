package diapositiva7ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char respuesta = 'S';
        while (respuesta == 'S') {

            System.out.println("Jugador 1, ingrese piedra(P) papel(L) o tijera(T): ");
            char jugador1 = sc.next().charAt(0);
            System.out.println("Jugador 2, ingrese piedra(P) papel(L) o tijera(T): ");
            char jugador2 = sc.next().charAt(0);

            if (jugador1 == 'P' && jugador2 == 'L') {
                System.out.println("Gana jugador 2, desea volver a jugar?");
            } else if (jugador1 == 'P' && jugador2 == 'P') {
                System.out.println("Empate, desea volver a jugar?");
            } else if (jugador1 == 'P' && jugador2 == 'T') {
                System.out.println("Gana jugador 1, desea volver a jugar?");
            } else if (jugador1 == 'L' && jugador2 == 'L') {
                System.out.println("Empate, desea volver a jugar?");
            } else if (jugador1 == 'L' && jugador2 == 'P') {
                System.out.println("Gana jugador 1, desea volver a jugar?");
            } else if (jugador1 == 'L' && jugador2 == 'T') {
                System.out.println("Gana jugador 2, desea volver a jugar?");
            } else if (jugador1 == 'T' && jugador2 == 'T') {
                System.out.println("Empate, desea volver a jugar?");
            } else if (jugador1 == 'T' && jugador2 == 'L') {
                System.out.println("Gana jugador 1, desea volver a jugar?");
            } else if (jugador1 == 'T' && jugador2 == 'P') {
                System.out.println("Gana jugador 2, desea volver a jugar?");
            }
            respuesta = sc.next().charAt(0);
        }
    }
}
