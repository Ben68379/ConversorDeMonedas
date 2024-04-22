package src;

public class Moneda {
    private String moneda;
    private double valor;

    public Moneda(String moneda, double valor){
        this.moneda =  moneda;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "moneda='" + moneda + '\'' +
                ", valor=" + valor +
                '}';
    }
}
