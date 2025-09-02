package practico2;

public class Punto13 {
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

    public static void ejecutar() {
        System.out.println("Precios originales:");
        mostrarPreciosRecursivoOriginal(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosRecursivoModificado(precios, 0);
    }
    public static void mostrarPreciosRecursivoOriginal(double[] array, int indice) {
        if (indice >= array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        mostrarPreciosRecursivoOriginal(array, indice + 1);
    }

    public static void mostrarPreciosRecursivoModificado(double[] array, int indice) {
        if (indice >= array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        mostrarPreciosRecursivoModificado(array, indice + 1);
    }
     public static void main(String[] args) {
        ejecutar();
    }
}
