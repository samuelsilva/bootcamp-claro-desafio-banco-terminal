import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar a entrada do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        // Exibindo as mensagens e capturando as entradas do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o nextInt()

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero +
                           " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
