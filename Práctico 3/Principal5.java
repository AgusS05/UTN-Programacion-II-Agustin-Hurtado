package punto5;

public class Principal5 {

   
    public static void main(String[] args) {
        
        NaveEspacial nave1 = new NaveEspacial("Endurance",50);
        nave1.despegar();
        nave1.avanzar(60);
        nave1.recargarCombustible(40);
        nave1.avanzar(60);
        nave1.mostrarEstado();        
    }  
}
