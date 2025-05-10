import java.util.Scanner;

public class ContaTerminal {
// 
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        String agencia = scanner.nextLine();
        System.out.println("Por favor , digite o número da Agência!.");
        

        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor , digite o número da sua Conta !.");

        String  nomeCliente = scanner.nextLine();
        System.out.println("Por favor , digite o nome do Cliente!.");
       

        double Saldo = scanner.nextDouble();
        System.out.println("Por favor , digite o Saldo da Conta!.");

        System.out.println("Olá" + nomeCliente + "obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ",conta" + numeroConta + "e seu saldo" + String.format("%.2f",Saldo) + "já está disponivel para saque." );


        scanner.close();

    }
}
