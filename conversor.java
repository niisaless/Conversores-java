public class Conversor {
    private double valorEntrada;
    private double valorSaida;
    private String unidadeOrigem;
    private String unidadeDestino;

    public Conversor(double entrada, String origem, String destino) {
        valorEntrada = entrada;
        unidadeOrigem = origem;
        unidadeDestino = destino;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double entrada) {
        valorEntrada = entrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double saida) {
        valorSaida = saida;
    }

    public String getUnidadeOrigem() {
    return unidadeOrigem;
    }

    public void setUnidadeOrigem(String origem) {
        unidadeOrigem = origem;
    }

    public String getUnidadeDestino() {
        return unidadeDestino;
    }

    public void setUnidadeDestino(String destino) {
        unidadeDestino = destino;
    }

    public void calcularConversao() {
    }

    public String toString() {
        return "Entrada: " + valorEntrada + " " + unidadeOrigem +
               " | Saída: " + valorSaida + " " + unidadeDestino;
    }
}
