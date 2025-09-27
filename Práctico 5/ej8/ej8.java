
package ej8;


public class ej8 {
     public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Agust�n Hurtado", "agustin.hurtado05@gmail.com");

        // Crear documento con firma digital 
        Documento documento = new Documento(
                "Contrato de Alquiler de casa",
                "Contenido del contrato:",
                "HASHEjemplo123",
                "16/09/2025",
                usuario
        );

        // Mostrar informaci�n documento
        System.out.println("Documento:");
        System.out.println(documento);

        // Mostrar informaci�n de la firma digital
        System.out.println("\nFirma Digital dentro del Documento:");
        System.out.println(documento.getFirma());

        // Mostrar informaci�n del usuario
        System.out.println("\nUsuario:");
        System.out.println(usuario);
    }
    
}
