package co.edu.utp.misiontic2022.c2;

public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println(letraMayuscula('N'));
    }

    public static char letraMayuscula(char letra) {
        char mensaje;
        if (Character.isUpperCase(letra)){
            mensaje = 'T';
        }
        else{
            mensaje = 'F';
        }
        return mensaje;   
    }
    
}
