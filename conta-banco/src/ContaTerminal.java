public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao Banco Java!");
        System.out.println("Por favor, informe o número da conta:");
        int numeroConta = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, informe o número da agência:");
        String numeroAgencia = System.console().readLine();

        System.out.println("Por favor, informe o nome do cliente:");
        String nomeCliente = System.console().readLine();

        System.out.println("Por favor, informe o saldo da conta:");
        double saldo = Double.parseDouble(System.console().readLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.printf("Sua conta nº %d, agência %s, foi criada com sucesso e seu saldo é de R$ %.2f%ne já esta disponivem para saque ", numeroConta, numeroAgencia, saldo);
    }
}
