
package ej5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;  
    private Propietario propietario; 

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); 
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Computadora{" +
               "marca=" + marca +
               ", numeroSerie=" + numeroSerie +
               ", placaMadre=" + placaMadre +
               ", propietario=" + (propietario != null ? propietario.getNombre() : "null") +
               '}';
    }
}
