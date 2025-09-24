
package punto4;


public class Principal4 {

    public static void main(String[] args) {
        Gallina n1 = new Gallina();
        Gallina n2 = new Gallina();
        
        n1.setIdGallina(0001);
        n1.setEdad(4);
        n1.setHuevosPuestos(15);
        
        n2.setIdGallina(0002);
        n2.setEdad(6);
        n2.setHuevosPuestos(21);
        
        n1.mostrarEstado();
        n2.mostrarEstado();
        
        n1.envejecer(1);
        n2.envejecer(1);
        
        n1.ponerHuevo(6);
        n2.ponerHuevo(8);
        
        n1.mostrarEstado();
        n2.mostrarEstado();
        
    }
    
}
