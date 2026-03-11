public class Conversor {

    private double valorEntrada;
    private double valorSaida;
    private String unidadeOrigem;
    private String unidadeDestino;

    public Conversor() {
    }

    public Conversor(double entrada, String origem, String destino) {
        this.valorEntrada = entrada;
        this.unidadeOrigem = origem;
        this.unidadeDestino = destino;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double entrada) {
        this.valorEntrada = entrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double saida) {
        this.valorSaida = saida;
    }

    public String getUnidadeOrigem() {
        return unidadeOrigem;
    }

    public void setUnidadeOrigem(String origem) {
        this.unidadeOrigem = origem;
    }

    public String getUnidadeDestino() {
        return unidadeDestino;
    }

    public void setUnidadeDestino(String destino) {
        this.unidadeDestino = destino;
    }

    public void calcularConversao() {
    }

    @Override
    public String toString() {
        return "Entrada: " + valorEntrada + " " + unidadeOrigem +
               " | Saída: " + valorSaida + " " + unidadeDestino;
    }
}