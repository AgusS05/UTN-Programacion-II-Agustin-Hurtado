
package ej13;


public class ej13 {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Agustín Hurtado", "agustin.hurtado05@gmail.com");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar CódigoQR 
        CodigoQR codigo = generador.generar("EJQR89525", usuario);

        // Mostrar información del CódigoQR
        System.out.println("\nInformación del Código QR:");
        System.out.println(codigo);

        // Mostrar información del usuario
        System.out.println("\nInformación del Usuario:");
        System.out.println(usuario);
    }
    
}
