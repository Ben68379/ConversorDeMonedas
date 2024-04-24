package com.aluracursosg6.conversordemonedas.Modelos;
import com.aluracursosg6.conversordemonedas.APIs.ExchangeRateAPI;
public class Moneda {
    private final double valor;
    private final String monedaOrigen;
    private final String monedaDestino;

    public double getValor() {
        return valor;
    }

    public Moneda(ExchangeRateAPI exchange){
        this.valor =  exchange.conversion_rate();
        this.monedaOrigen = exchange.base_code();
        this.monedaDestino = exchange.target_code();
    }

    @Override
    public String toString() {
        return "Moneda origen= " + monedaOrigen + " Moneda Destino= " +
                monedaDestino + " Valor=" + valor +
                '}';
    }
}
