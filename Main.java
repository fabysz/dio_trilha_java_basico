
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaTerminal ct = new ContaTerminal();

        
      
        System.out.println("Por Favor digite o número da agência: " );
        ct.agencia = sc.next();

        System.out.println("Digite o número da sua conta: ");
        ct.numero = sc.nextInt();

        System.out.println("Digite seu Nome:");
        ct.nomeCliente = sc.next();

        
        System.out.println("Olá " + ct.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + ct.agencia +  " sua conta é " + ct.numero + " e seu saldo de" + ct.saldo + " já está disponível para saque.");


        sc.close();

    }
}

