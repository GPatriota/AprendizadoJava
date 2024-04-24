package Aprendizado.ContaBanco;

public class Usuario {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        conta.CriandoConta();
        conta.ApresentacaoInicial();

        while (conta.opcao != 3){
            if (conta.opcao == 1){
                conta.AdicionarDinheiro();
                conta.ApresentacaoPós();
            }
            else if (conta.opcao == 2){
                conta.Sacar();
                conta.ApresentacaoPós();
            }
        }
        System.out.println("Programa encerrado com sucesso.");
}
}
