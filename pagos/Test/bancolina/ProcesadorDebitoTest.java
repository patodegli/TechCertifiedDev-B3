package bancolina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorDebitoTest {

    @Test

    public void controlProcesadorDebito() {
        //dado
        ProcesadorPago pagoDebito = new ProcesadorDebito();
        Tarjeta tarjetaDebitoOk = new TarjetaDebito(122251, 235, new Date(130, 10, 12), 2000);
        Tarjeta tarjetaDebitoExpirada = new TarjetaDebito(251425, 666, new Date(100, 10, 20), 200);
        //cuando
        String resultadoOk = pagoDebito.procesarPago(tarjetaDebitoOk, 400);
        String resultadoExpirada = pagoDebito.procesarPago(tarjetaDebitoExpirada, 400);
        String resultadoSaldoInsuficiente = pagoDebito.procesarPago(tarjetaDebitoOk, 5000);

        //entonces
        Assertions.assertEquals("Pago procesado con éxito", resultadoOk);
        Assertions.assertEquals("Tarjeta expirada, no se puede procesar pago", resultadoExpirada);
        Assertions.assertEquals("Tarjeta no autorizada", resultadoSaldoInsuficiente);
    }
}