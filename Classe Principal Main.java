import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Criar Conta Bancária ===");
        System.out.print("Nome da Pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Saldo Inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");

        String opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar valor");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Obter saldo disponível");
            System.out.println("Q - Sair");
            System.out.print("Opção: ");
            opcao = scanner.next();

            switch (opcao.toUpperCase()) {
                case "1":
                    System.out.print("Informe o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case "2":
                    System.out.print("Informe o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case "3":
                    conta.exibirSaldo();
                    break;

                case "Q":
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equalsIgnoreCase("Q"));

        scanner.close();
    }
}
