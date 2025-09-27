
package ej7;


public class ej7 {
     public static void main(String[] args) {
        // Crear motor (puede existir independientemente del vehí­culo)
        Motor motor = new Motor("Diesel", "Motor2.0T");

        // Crear conductor
        Conductor conductor = new Conductor("Agustín Hurtado", "LicenciaB2-ASD123");

        // Crear vehÃ­culo y asociarle el motor
        Vehiculo vehiculo = new Vehiculo("ZZZ-123", "Volkswagen Vento", motor);

        // Asociar bidireccionalmente vehí­culo y conductor
        conductor.setVehiculo(vehiculo);

        // Mostrar información vehí­culo
        System.out.println("Vehí­culo:");
        System.out.println(vehiculo);

        // Mostrar información conductor
        System.out.println("\nConductor:");
        System.out.println(conductor);

        // Mostrar información del motor
        System.out.println("\nMotor asociado:");
        System.out.println(motor);
    }
    
}
