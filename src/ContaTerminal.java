import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria��o do objeto Scanner para capturar a entrada do usu�rio via terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha ap�s o nextInt()


        // Exibindo as mensagens e capturando as entradas do usu�rio
        System.out.println("Por favor, digite o n�mero da Agencia:");
        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        String saldoInput = scanner.nextLine();
        saldoInput = saldoInput.replace(",", "."); // Substitui v�rgula por ponto
        double saldo = Double.parseDouble(saldoInput);

        // Exibindo a mensagem final com as informa��es fornecidas
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agencia " + agencia + ", conta " + numero +
                           " e seu saldo " + saldo + " ja esta disponivel para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
