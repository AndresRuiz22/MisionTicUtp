package co.edu.utp.misiontic2022.c2;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(quitaCifras());
    }

    public static int quitaCifras() {
        int N = 123456789;
        int m = 5;

        for (int i = 0; i < m; i++) {
            N /= 10;
        }

        return N;        
    }
}
