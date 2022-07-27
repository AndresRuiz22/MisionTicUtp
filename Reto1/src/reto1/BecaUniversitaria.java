package reto1;

public class BecaUniversitaria {

    //Atributos
    private int pTiempo;
    private double pMonto;
    private double pInteres;

    //Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public BecaUniversitaria() {
        this.pTiempo = 0;
        this.pMonto = 0;
        this.pInteres = 0;
    }

    //Metodos
    public double calcularInteresSimple() {
        double interesSimple = pMonto * (pInteres / 100) * pTiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto() {
        double interesCompuesto = pMonto * (Math.pow((1 + pInteres / 100), pTiempo) - 1);
        return Math.round(interesCompuesto);
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        double diferencia = calcularInteresSimple() - calcularInteresCompuesto();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

    public String compararInversion() {
        double diferencia = calcularInteresSimple() - calcularInteresCompuesto();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

    public static void main(String args[]) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60, 13000, 1.4));
        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48, 10000, 2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());
        BecaUniversitaria becaUniversitaria2b = new BecaUniversitaria();
        System.out.println(becaUniversitaria2b.calcularInteresSimple());
        System.out.println(becaUniversitaria2b.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2b.compararInversion());
    }
}
