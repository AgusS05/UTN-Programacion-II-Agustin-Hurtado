package interfaces;


public interface PagoConDescuento extends Pago{
    double aplicarDescuento(double montoBase, double porcentaje);
}