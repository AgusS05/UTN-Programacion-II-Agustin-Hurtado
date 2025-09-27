
package ej13;


public class ej13 {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Agust�n Hurtado", "agustin.hurtado05@gmail.com");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar C�digoQR 
        CodigoQR codigo = generador.generar("EJQR89525", usuario);

        // Mostrar informaci�n del C�digoQR
        System.out.println("\nInformaci�n del C�digo QR:");
        System.out.println(codigo);

        // Mostrar informaci�n del usuario
        System.out.println("\nInformaci�n del Usuario:");
        System.out.println(usuario);
    }
    
}
