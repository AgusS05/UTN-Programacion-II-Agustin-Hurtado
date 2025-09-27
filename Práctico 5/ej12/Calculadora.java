
package ej12;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Calculando impuesto de " +
                               impuesto.getContribuyente().getNombre() +
                               ": $" + impuesto.getMonto());
        } else {
            System.out.println("No hay impuesto para calcular.");
        }
    }
}