
package ej10;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; 
    private Titular titular;               

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getCbu() {
        return cbu;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
               "cbu=" + cbu +
               ", saldo=" + saldo +
               ", claveSeguridad=" + claveSeguridad +
               ", titular=" + (titular != null ? titular.getNombre() : "null") +
               '}';
    }
}
