import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia, nomeCliente;
        Double saldo;

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo atual: ");
        saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é de %.2f já está disponível para saque.",
                                nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
}