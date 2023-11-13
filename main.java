import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        int numeroDaConta;
        String nome, agencia;
        float saldo;

        System.out.println("Digite o número da conta");
        numeroDaConta = scanner.nextInt();
        conta.setNumero(numeroDaConta);
        System.out.println("Digite a agencia");
        agencia = scanner.next();
        conta.setAgencia(agencia);
        System.out.println("Digite o seu nome");
        nome = scanner.next();
        conta.setNomeCliente(nome);
        try {
            System.out.println("Digite o saldo");
            saldo = scanner.nextFloat();
            conta.setSaldo(saldo);
        } catch(InputMismatchException error) {
            System.out.println("Valor digitado invalido");
            error.printStackTrace();
        }
        
        System.out.println(conta.toString());
        scanner.close();
    }
}
