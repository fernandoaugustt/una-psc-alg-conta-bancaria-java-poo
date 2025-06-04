public class ContaBancaria {
    private String nomePessoa;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomePessoa, String numeroConta, double saldoInicial) {
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }
}
