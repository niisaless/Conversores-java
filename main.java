import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Conversor> listaConversoes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Realizar Conversão");
            System.out.println("2- Exibir Histórico");
            System.out.println("3- Alterar Conversão");
            System.out.println("4- Deletar Conversão");
            System.out.println("0- Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha a unidade de origem (Celsius, Fahrenheit, Kelvin, Joules, Calorias, Volts): ");
                    String origem = s.next();
                    System.out.println("Escolha a unidade de destino (Celsius, Fahrenheit, Kelvin, Joules, Calorias, Volts): ");
                    String destino = s.next();
                    System.out.println("Digite o valor de entrada: ");
                    double valor = s.nextDouble();

                    Conversor Conversor;

                    if (origem.equals("Celsius")) {
                        Conversor = new ConversorTermico(valor, origem, destino);

                    } else if (origem.equals("Fahrenheit")) {
                        Conversor = new ConversorTermico(valor, origem, destino);

                    } else if (origem.equals("Kelvin")) {
                        Conversor = new ConversorTermico(valor, origem, destino);

                    } else {
                        Conversor = new ConversorEnergetico(valor, origem, destino);
                    }

                    Conversor.calcularConversao();
                    listaConversoes.add(Conversor);
                    System.out.println("Conversão realizada: " + Conversor);
                    break;

                case 2:
                    System.out.println("Histórico de Conversões:");
                    for (int i = 0; i < listaConversoes.size(); i++) {
                        System.out.println(i + " - " + listaConversoes.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Digite o índice da conversão a ser alterada: ");
                    int index = s.nextInt();
                    if (index >= 0 && index < listaConversoes.size()) {
                        Conversor conversaoAlterada = listaConversoes.get(index);
                        System.out.println("Digite o novo valor de entrada: ");
                        double novoValor = s.nextDouble();
                        conversaoAlterada.setValorEntrada(novoValor);

                        conversaoAlterada.calcularConversao();
                        System.out.println("Conversão alterada: " + conversaoAlterada);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o índice da conversão a ser deletada: ");
                    index = s.nextInt();
                    if (index >= 0 && index < listaConversoes.size()) {
                        listaConversoes.remove(index);
                        System.out.println("Conversão removida.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        s.close();
    }
}
