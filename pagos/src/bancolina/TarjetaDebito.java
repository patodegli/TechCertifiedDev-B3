package bancolina;

import java.util.Date;

public class TarjetaDebito extends Tarjeta{
    private int saldo;

    public TarjetaDebito(int nroFrente, int codSeg, Date fechaExpiracion, int saldo) {
        super(nroFrente, codSeg, fechaExpiracion);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
