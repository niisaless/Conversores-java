public class ConversorTermico extends Conversor {

    public ConversorTermico(double entrada, String origem, String destino) {
        setValorEntrada(entrada);
        setUnidadeOrigem(origem);
        setUnidadeDestino(destino);
    }

    public void calcularConversao() {

        double resultado = 0;

        if (getUnidadeOrigem().equals("Celsius") && getUnidadeDestino().equals("Fahrenheit")) {
            resultado = (getValorEntrada() * 9 / 5) + 32;

        } else if (getUnidadeOrigem().equals("Celsius") && getUnidadeDestino().equals("Kelvin")) {
            resultado = getValorEntrada() + 273.15;

        } else if (getUnidadeOrigem().equals("Fahrenheit") && getUnidadeDestino().equals("Celsius")) {
            resultado = (getValorEntrada() - 32) * 5 / 9;

        } else if (getUnidadeOrigem().equals("Kelvin") && getUnidadeDestino().equals("Fahrenheit")) {
            resultado = (getValorEntrada() - 273.15) * 9 / 5 + 32;
        }

        setValorSaida(resultado);
    }
}
