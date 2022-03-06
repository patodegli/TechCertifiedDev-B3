package bancolina;

public class ProcesadorCredito extends ProcesadorPago{


    @Override
    protected boolean autorizaPago(Tarjeta tarjeta, int monto) {
        TarjetaCredito tc = (TarjetaCredito) tarjeta;
        return tc.getSaldo() + monto <= tc.getLimite();
    }
}
