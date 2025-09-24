package punto2;


public class Principal2 {

    
    public static void main(String[] args) {
        Mascota primerMascota = new Mascota();
        
        primerMascota.setNombre("Fusa");
        primerMascota.setEspecie("Gata");
        primerMascota.setEdad(10);
        
        primerMascota.mostrarInfo();
        primerMascota.cumplirAnios(1);
        primerMascota.mostrarInfo();
    }
    
}
