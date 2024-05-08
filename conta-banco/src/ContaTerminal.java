// TODO: conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     //Exibir mensagens para nosso usuario
      
      System.out.println(" *** Bem vindo ao banco digital *** ");

      // Obter pela Scanner os valores digitados pelo terminal
      Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite seu nome:");
      String nome = Scanner.next();


      System.out.println("Digite o numero da conta:");
      int numeroConta = Scanner.nextInt();

      System.out.println("Por favor digite o numero da agencia:");
      String agencia = Scanner.next();

      System.out.println("Digite seu saldo");
      double saldo = Scanner.nextDouble();
      Scanner.close();
     
     
    // Exibir mensagem da conta criada
      System.out.println(" Olá " + nome + " Obrigado por ter criado sua conta !!");
      System.out.println("Sua agencia é : " + agencia);
      System.out.println("Sua conta é " + numeroConta);
      System.out.println("Seu saldo é : " + saldo);
    
    }
}
