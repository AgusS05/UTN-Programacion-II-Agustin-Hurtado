package practico2;


public class Punto12 {
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    public static void ejecutar() {
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }
    public static void mostrarPrecios(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Precio: $" + array[i]);
        }
    }
     public static void main(String[] args) {
        ejecutar();
    }
}
