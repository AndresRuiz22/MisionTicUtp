package Reto2;

public class PrecioTotal {

    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;
// Constructor

    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
// Código
        for (Computadores i : listaComputadores) {
            if (i instanceof Computadores) {
                totalComputadores += i.calcularPrecio();
            } if (i instanceof ComputadoresMesa) {
                totalComputadoresMesa += i.calcularPrecio();
            } if (i instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += i.calcularPrecio();
            }
        }
// Mostramos los resultados
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.println("La suma del precio de los computadores portátiles es de "+ totalComputadoresPortatiles);
    }
}
