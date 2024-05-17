import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {


       int numero;
       String agencia;
       String nomeDoCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número da sua conta: ");
        String numeroStr = scanner.nextLine();
        try {
            numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            System.out.println("Erro: você deve digitar um número inteiro válido para o número da conta.");
            scanner.close();
            return;
        }


        System.out.print("Digite o número da sua agência: ");
        agencia = scanner.nextLine();


        System.out.print("Digite o seu nome: ");
        nomeDoCliente = scanner.nextLine();

        System.out.print("Digite o seu saldo: ");
         saldo = scanner.nextDouble();

        System.out.println("O número da sua conta é :" + numeroStr + " Sua agência é " + agencia +"," +  "Nome do cliente é " + nomeDoCliente + "Seu saldo é:" + saldo) ;
    }
}
