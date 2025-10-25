package ejercicio3;

public class Main {
    public static void main(String[] args) {
        EmpleadoTemporal empTemp = new EmpleadoTemporal(2000, 10, "Juan", "Pérez", "TMP123");
        EmpleadoPlanta empPlanta = new EmpleadoPlanta(3000, 5, "Ana", "Gómez", "PLT456");

        System.out.println("Empleado Temporal: " + empTemp.getNombreCompleto() +
            ", ID: " + empTemp.getId() +
            ", Sueldo: " + empTemp.calcularSueldo());

        System.out.println("Empleado Planta: " + empPlanta.getNombreCompleto() +
            ", ID: " + empPlanta.getId() +
            ", Sueldo: " + empPlanta.calcularSueldo());
    }
}