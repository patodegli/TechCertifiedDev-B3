package bancolina;

import java.util.Date;

public class TarjetaCredito extends Tarjeta {
    private int limite;
    private int saldo;

    public TarjetaCredito(int nroFrente, int codSeg, Date fechaExpiracion, int limite, int saldo) {
        super(nroFrente, codSeg, fechaExpiracion);
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public int getSaldo() {
        return saldo;
    }
}
