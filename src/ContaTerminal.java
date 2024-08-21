import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria��o do objeto Scanner para capturar a entrada do usu�rio via terminal
        Scanner scanner = new Scanner(System.in);

        // Exibindo as mensagens e capturando as entradas do usu�rio
        System.out.println("Por favor, digite o n�mero da Ag�ncia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha ap�s o nextInt()

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com as informa��es fornecidas
        System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua ag�ncia � " + agencia + ", conta " + numero +
                           " e seu saldo " + saldo + " j� est� dispon�vel para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
