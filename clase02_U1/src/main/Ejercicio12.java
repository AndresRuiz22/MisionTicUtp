package co.edu.utp.misiontic2022.c2;

public class Ejercicio12 {
    public static void main(String[] args){
        mostrarNum();
    }

    public static void mostrarNum() {
        int num = 1;
        System.out.println("While: ");
        while (num<101){
            if (num%3!=0){
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println();
        System.out.println("Do while: ");
        num = 1;
        do {
            if (num%3!=0){
                System.out.print(num + " ");
            }
            num++;
        }
        while (num<101);
        
        System.out.println();
        System.out.println("For: ");
        for (num=1; num<101; num++){
            if (num%3!=0){
                System.out.print(num + " ");
            }
        }
    }
}
