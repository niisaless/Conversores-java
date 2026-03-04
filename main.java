import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Conversor> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n MENU PRINCIPAL ");
            System.out.println("1: Nova Conversão");
            System.out.println("2: Listar Conversões");
            System.out.println("3: Deletar Conversão");
            System.out.println("0: Sair");

            opcao = s.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nEscolha o tipo:");
                    System.out.println("1: Conversor Térmico");
                    System.out.println("2: Conversor Energético");

                    int tipo = s.nextInt();

                    String origem = "";
                    String destino = "";
                    double valor;

                    if (tipo == 1) {

                        System.out.println("\n CONVERSOR TÉRMICO ");
                        System.out.println("1: Celsius(C) -> Fahrenheit(F)");
                        System.out.println("2: Celsius(C) -> Kelvin(K)");
                        System.out.println("3: Fahrenheit(F) -> Celsius(C)");
                        System.out.println("4: Kelvin(K) -> Fahrenheit(F)");

                        int opcaoTermica = s.nextInt();

                        System.out.println("Digite o valor:");
                        valor = s.nextDouble();

                        switch (opcaoTermica) {
                            case 1:
                                origem = "C";
                                destino = "F";
                                break;
                            case 2:
                                origem = "C";
                                destino = "K";
                                break;
                            case 3:
                                origem = "F";
                                destino = "C";
                                break;
                            case 4:
                                origem = "K";
                                destino = "F";
                                break;
                            default:
                                System.out.println("Opção incorreta.");
                                continue;
                        }

                    } else if (tipo == 2) {

                        System.out.println("\n CONVERSOR ENERGÉTICO ");
                        System.out.println("1: Joules(J) -> Calorias(CAL)");
                        System.out.println("2: Calorias(CAL) -> Joules(J)");
                        System.out.println("3: Joules(J) -> Volts(V)");
                        System.out.println("4: Volts(V) -> Calorias(CAL)");

                        int opcaoEnergia = s.nextInt();

                        System.out.println("Digite o valor:");
                        valor = s.nextDouble();

                        switch (opcaoEnergia) {
                            case 1:
                                origem = "J";
                                destino = "CAL";
                                break;
                            case 2:
                                origem = "CAL";
                                destino = "J";
                                break;
                            case 3:
                                origem = "J";
                                destino = "V";
                                break;
                            case 4:
                                origem = "V";
                                destino = "CAL";
                                break;
                            default:
                                System.out.println("Opção incorreta.");
                                continue;
                        }

                    } else {
                        System.out.println("Tipo incorreto");
                        continue;
                    }

                    // 🔥 OPERADOR TERNÁRIO OBRIGATÓRIO AQUI
                    Conversor conversor = (tipo == 1)
                            ? new ConversorTermico(valor, origem, destino)
                            : new ConversorEnergetico(valor, origem, destino);

                    conversor.calcularConversao();
                    lista.add(conversor);

                    System.out.println("Conversão realizada com sucesso.");
                    break;

                case 2:
                    System.out.println("\n HISTÓRICO ");

                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma conversão registrada.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o índice para deletar:");
                    int index = s.nextInt();

                    if (index >= 0 && index < lista.size()) {
                        lista.remove(index);
                        System.out.println("Conversão removida.");
                    } else {
                        System.out.println("Índice incorreto.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Opção incorreta.");
            }

        } while (opcao != 0);

        s.close();
    }
}