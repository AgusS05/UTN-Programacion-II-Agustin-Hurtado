
package ej9;


public class ej9 {
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Agustín Hurtado", "Apross");

        // Crear profesional
        Profesional profesional = new Profesional("Dr. Nores Miguel Angel", "Cirugía General");

        // Crear cita médica asociando paciente y profesional
        CitaMedica cita = new CitaMedica("19/09/2025", "16:30", paciente, profesional);

        // Mostrar información de la cita
        System.out.println("Información de la Cita Médica:");
        System.out.println(cita);

        // Mostrar información del paciente
        System.out.println("\nInformación del Paciente:");
        System.out.println(paciente);

        // Mostrar información del profesional
        System.out.println("\nInformación del Profesional:");
        System.out.println(profesional);
    }
    
}
