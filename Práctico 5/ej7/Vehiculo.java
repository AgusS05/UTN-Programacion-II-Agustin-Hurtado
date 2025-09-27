
package ej7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // agregaci�n
    private Conductor conductor; // asociaci�n bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
               "patente=" + patente +
               ", modelo=" + modelo +
               ", motor=" + (motor != null ? motor : "null") +
               ", conductor=" + (conductor != null ? conductor.getNombre() : "null") +
               '}';
    }
}
