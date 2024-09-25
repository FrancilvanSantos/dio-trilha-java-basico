import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int numero = 0;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = input.next();

        System.out.println("Digite o nome do cliente: ");
        nome = input.next();

        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo de R$ " +saldo + " já está disponível para saque.");
    }
}
