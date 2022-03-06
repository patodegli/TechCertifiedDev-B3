package bancolina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorCreditoTest {
    @Test

    public void controlProcesadorPago(){

        //dado
        ProcesadorPago pagoCredito = new ProcesadorCredito();
        Tarjeta tarjetaCreditoOk = new TarjetaCredito(252525, 333, new Date(130, 10,20), 20000, 200);
        Tarjeta tarjetaCreditoExpirada = new TarjetaCredito(252525, 333, new Date(100, 10,20), 20000, 200);

        //cuando
        String resultadoOk = pagoCredito.procesarPago(tarjetaCreditoOk, 200);
        String resultadoExpirada = pagoCredito.procesarPago(tarjetaCreditoExpirada, 200);
        String resultadoLimiteInsuficiente = pagoCredito.procesarPago(tarjetaCreditoOk, 20000);

        //entonces
        Assertions.assertEquals("Pago procesado con éxito", resultadoOk);
        Assertions.assertEquals("Tarjeta expirada, no se puede procesar pago", resultadoExpirada);
        Assertions.assertEquals("Tarjeta no autorizada", resultadoLimiteInsuficiente);

    }

}