public class Main {

    public static void main(String[] args) {
        Cliente luciano = new Cliente();
        luciano.setNome("Luciano");

        Conta contaCorrente = new ContaCorrente(luciano);
        contaCorrente.depositar(1500);

        Conta contaPoupanca = new ContaPoupanca(luciano);
        contaCorrente.transferir(500, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
