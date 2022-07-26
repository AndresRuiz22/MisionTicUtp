package co.edu.utp.misiontic2022.c2;

public class Ejercicio11 {
    public static void main(String[] args){
        System.out.println(identificadorMes(5));
        
    }

    public static String identificadorMes(int mes ){
        String mensaje;

        if (mes<1 || mes>12){
            mensaje = "Mes no valido";
        }
        else{
            mensaje = " ";
            switch (mes) {
                
                case 1:
                    mensaje = "Enero - 31 dias";
                    break;
                case 2:
                    mensaje = "Febrero - 28 dias";
                    break;
                case 3:
                    mensaje = "Marzo - 31 dias";
                    break;
                case 4:
                    mensaje = "Abril - 30 dias"; 
                    break;
                case 5:
                    mensaje = "Mayo - 31 dias";
                    break;
                case 6:
                    mensaje = "Junio - 30 dias";
                    break;
                case 7:
                    mensaje = "Julio - 31 dias";
                    break;
                case 8:
                    mensaje = "Agosto - 30 dias";
                    break;
                case 9:
                    mensaje = "Septiembre - 30 dias";
                    break;
                case 10:
                    mensaje = "Octubre - 31 dias";
                    break;
                case 11:
                    mensaje = "Noviembre - 30 dias";
                    break;
                case 12:
                    mensaje = "Diciembre - 31 dias";
                    break;
            }
        }
        return mensaje;
    }
}
