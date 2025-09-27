
package ej8;


public class ej8 {
     public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Agustín Hurtado", "agustin.hurtado05@gmail.com");

        // Crear documento con firma digital 
        Documento documento = new Documento(
                "Contrato de Alquiler de casa",
                "Contenido del contrato:",
                "HASHEjemplo123",
                "16/09/2025",
                usuario
        );

        // Mostrar información documento
        System.out.println("Documento:");
        System.out.println(documento);

        // Mostrar información de la firma digital
        System.out.println("\nFirma Digital dentro del Documento:");
        System.out.println(documento.getFirma());

        // Mostrar información del usuario
        System.out.println("\nUsuario:");
        System.out.println(usuario);
    }
    
}
