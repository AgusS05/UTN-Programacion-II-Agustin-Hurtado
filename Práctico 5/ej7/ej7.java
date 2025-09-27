
package ej7;


public class ej7 {
     public static void main(String[] args) {
        // Crear motor (puede existir independientemente del veh�culo)
        Motor motor = new Motor("Diesel", "Motor2.0T");

        // Crear conductor
        Conductor conductor = new Conductor("Agust�n Hurtado", "LicenciaB2-ASD123");

        // Crear vehículo y asociarle el motor
        Vehiculo vehiculo = new Vehiculo("ZZZ-123", "Volkswagen Vento", motor);

        // Asociar bidireccionalmente veh�culo y conductor
        conductor.setVehiculo(vehiculo);

        // Mostrar informaci�n veh�culo
        System.out.println("Veh�culo:");
        System.out.println(vehiculo);

        // Mostrar informaci�n conductor
        System.out.println("\nConductor:");
        System.out.println(conductor);

        // Mostrar informaci�n del motor
        System.out.println("\nMotor asociado:");
        System.out.println(motor);
    }
    
}
