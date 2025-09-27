
package ej2;

public class ej2 {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Agustin Hurtado", "12345678");

        // Crear baterí­a 
        Bateria bateria = new Bateria("Bat-20000mAh", 20000);

        // Crear celular y asociarle la baterí­a
        Celular celular = new Celular("IMEI123456", "Samsung", "Galaxy S25 Ultra", bateria);

        // Asociar bidireccionalmente celular y usuario
        usuario.setCelular(celular);

        // Mostrar informacion celular
        System.out.println("Celular:");
        System.out.println(celular);

        // Mostrar informacion usuario
        System.out.println("\nUsuario:");
        System.out.println(usuario);
    }
}
   
