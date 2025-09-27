
package ej13;


public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generando C�digo QR para " + usuario.getNombre() + ": " + valor);
        return qr;
    }
}