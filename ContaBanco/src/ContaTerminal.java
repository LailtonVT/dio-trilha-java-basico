import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // TO DO: Conhecer e importar a clase Scanner;
        // Exibir as mensagens para o usuario;
        // Obter pela funcao scanner os valores digitados pelo usuario;
        // Exibir a mensagem final;
        
        System.out.println("Por favor digite o numero da conta: " );
        int numero = scanner.nextInt();
       
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.println("Por favor digite o numero da agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
