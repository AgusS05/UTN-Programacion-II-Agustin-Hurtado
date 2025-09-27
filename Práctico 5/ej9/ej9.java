
package ej9;


public class ej9 {
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Agust�n Hurtado", "Apross");

        // Crear profesional
        Profesional profesional = new Profesional("Dr. Nores Miguel Angel", "Cirug�a General");

        // Crear cita m�dica asociando paciente y profesional
        CitaMedica cita = new CitaMedica("19/09/2025", "16:30", paciente, profesional);

        // Mostrar informaci�n de la cita
        System.out.println("Informaci�n de la Cita M�dica:");
        System.out.println(cita);

        // Mostrar informaci�n del paciente
        System.out.println("\nInformaci�n del Paciente:");
        System.out.println(paciente);

        // Mostrar informaci�n del profesional
        System.out.println("\nInformaci�n del Profesional:");
        System.out.println(profesional);
    }
    
}
