package Aprendizado.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    int numeroDaConta;
    String agenciaDaConta;
    String nomeDoTitular;
    double saldoConta;
    int opcao;
    Scanner ler = new Scanner (System.in);

    
    public void CriandoConta (){
        System.out.println("Digite aqui o nome do titular da conta: ");
        nomeDoTitular = ler.nextLine();
        System.out.println("Digite aqui a agência da sua conta: ");
        agenciaDaConta = ler.nextLine();
        System.out.println("Digite aqui o número da sua conta: ");
        numeroDaConta = ler.nextInt();             
        System.out.println("Digite aqui o saldo da conta: ");
        saldoConta = ler.nextDouble();
    }

    public void ApresentacaoInicial (){
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeDoTitular, agenciaDaConta, numeroDaConta, saldoConta);
        System.out.println(mensagem);
        System.out.println ("O que deseja realizar?");
        System.out.println ("Digite 1 para adicionar dinheiro.");
        System.out.println ("Digite 2 para sacar dinheiro.");
        System.out.println ("Digite 3 para encerrar o programa.");
        opcao = ler.nextInt();
    }

    public void ApresentacaoPós (){
        System.out.println("Deseja realizar mais algo?");
        System.out.println ("Digite 1 para adicionar dinheiro.");
        System.out.println ("Digite 2 para sacar dinheiro.");
        System.out.println ("Digite 3 para encerrar o programa.");
        opcao = ler.nextInt();
    }

    public void Sacar () {
        System.out.println("Quanto deseja sacar de sua conta?");
        double valorSaque = Double.parseDouble(ler.next());
        if (valorSaque > saldoConta)
        {
            System.out.println("Saldo insuficiente.");
        }
        else{
            saldoConta = saldoConta - valorSaque;
            System.out.println("Saque realizado com sucesso, seu novo saldo bancário agora é: R$ " + saldoConta + " reais.");
        }
    }

    public void AdicionarDinheiro (){
        System.out.println("Quanto deseja adicionar em sua conta?");
        double valorAdd = Double.parseDouble(ler.next());
        saldoConta = saldoConta + valorAdd;
        System.out.println("Dinheiro adicionado com sucesso, seu novo saldo bancário é de: R$ " + saldoConta + " reais.");
    }
}
