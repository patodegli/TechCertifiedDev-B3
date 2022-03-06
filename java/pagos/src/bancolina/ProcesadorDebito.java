package bancolina;

public class ProcesadorDebito extends ProcesadorPago{


    @Override
    protected boolean autorizaPago(Tarjeta tarjeta, int monto) {
        TarjetaDebito td = (TarjetaDebito) tarjeta;

        return td.getSaldo() > monto;
    }
}
