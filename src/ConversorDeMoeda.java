public abstract class ConversorDeMoeda {
    protected String moedaOrigem;
    protected String moedaDestino;

    public ConversorDeMoeda(String moedaOrigem, String moedaDestino) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public abstract double converte(double quantia);
}

