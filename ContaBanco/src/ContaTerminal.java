import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o seu saldo: ");
        float saldo = scanner.nextFloat();
        System.out.println("----- Menu -----");
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência " + agencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        System.out.println("---------------");
    }
}