package bancolina;

import java.util.Date;

public abstract class ProcesadorPago {

    public String procesarPago(Tarjeta tarjeta, int monto){
        // validar expiracion
        if(tarjetaExpirada(tarjeta)){
            return "Tarjeta expirada, no se puede procesar pago";
        }
        // solicitar autorizacion
        if(!autorizaPago(tarjeta, monto)){
            return "Tarjeta no autorizada";
        };
        //procesar pago
        return "Pago procesado con éxito";
    };

    private boolean tarjetaExpirada(Tarjeta tarjeta){
        Date hoy = new Date();
        Date fechaExp = tarjeta.getFechaExpiracion();
        return hoy.compareTo(fechaExp) > 0;
    };

    protected abstract boolean autorizaPago(Tarjeta tarjeta, int monto);
}
