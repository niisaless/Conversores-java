public class ConversorEnergetico extends Conversor {

    public ConversorEnergetico(double entrada, String origem, String destino) {
        setValorEntrada(entrada);
        setUnidadeOrigem(origem);
        setUnidadeDestino(destino);
    }

    public void calcularConversao() {

        double resultado = 0;

        if (getUnidadeOrigem().equals("Joules") && getUnidadeDestino().equals("Calorias")) {
            resultado = getValorEntrada() * 0.239;

        } else if (getUnidadeOrigem().equals("Calorias") && getUnidadeDestino().equals("Joules")) {
            resultado = getValorEntrada() * 4.184;

        } else if (getUnidadeOrigem().equals("Joules") && getUnidadeDestino().equals("Volts")) {
            resultado = getValorEntrada() / 1000;

        } else if (getUnidadeOrigem().equals("Volts") && getUnidadeDestino().equals("Calorias")) {
            resultado = getValorEntrada() * 0.24;
        }

        setValorSaida(resultado);
    }
}