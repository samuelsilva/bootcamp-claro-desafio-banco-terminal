import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar a entrada do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o nextInt()


        // Exibindo as mensagens e capturando as entradas do usuï¿½rio
        System.out.println("Por favor, digite o número da Agencia:");
        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        String saldoInput = scanner.nextLine();
        saldoInput = saldoInput.replace(",", "."); // Substitui vírgula por ponto
        double saldo = Double.parseDouble(saldoInput);

        // Exibindo a mensagem final com as informaï¿½ï¿½es fornecidas
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agencia " + agencia + ", conta " + numero +
                           " e seu saldo " + saldo + " ja esta disponivel para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
