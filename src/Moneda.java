package src;

public class Moneda { ;
    private double valor;
    private String monedaOrigen;
    private String monedaDestino;

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
