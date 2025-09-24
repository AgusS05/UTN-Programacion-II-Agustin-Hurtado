package punto5;


public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;
    
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }
    
    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }
    
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");                        
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            System.out.println("No se puede recargar el combustible, excede el límite." + " Límite: " + LIMITE_COMBUSTIBLE);
            combustible = LIMITE_COMBUSTIBLE;
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("La nave " + nombre + " tiene " + combustible + " unidades de combustible.");
    }
    
}
