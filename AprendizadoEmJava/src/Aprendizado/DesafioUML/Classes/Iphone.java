package Aprendizado.DesafioUML.Classes;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    public void addPagina (){
        System.out.println("Adicionando página diretamente pelo Iphone...");
    }

    public void attPagina (){
        System.out.println("Atualizando página diretamente pelo Iphone...");
    }

    public void exibePagina (){
        System.out.println("Exibindo página diretamente pelo Iphone...");
    }

    public void ligar(){
        System.out.println("Ligando diretamente pelo Iphone...");
    }

    public void atender (){
        System.out.println("Atendendo ligação diretamente pelo Iphone...");
    }

    public void iniciarCorrerioVoz (){
        System.out.println("Iniciando correio de voz diretamente pelo Iphone...");
    }
    
    public void toca (){
        System.out.println("Tocando música diretamente pelo Iphone...");
    }

    public void pausa (){
        System.out.println("Pausando música diretamente pelo Iphone...");
    }

    public void selecionaMusica (){
        System.out.println("Selecionando música diretamente pelo Iphone...");
    }

}
