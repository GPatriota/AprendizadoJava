package Aprendizado.DesafioUML.Funcoes;

import Aprendizado.DesafioUML.Classes.*;

public class PessoaUsandoCelular {
    public static void main(String[] args) {
        Navegador navegador = new GuiaNavegador();
        AparelhoTelefonico ligar = new Ligacoes();
        ReprodutorMusical musicas = new Musica();
        Iphone celular = new Iphone();

        System.out.println("A partir diretamente do navegador: ");
        navegador.addPagina();
        navegador.attPagina();
        navegador.exibePagina();

        System.out.println("\n A partir diretamente do aparelho telefônico: ");
        ligar.ligar();
        ligar.atender();
        ligar.iniciarCorrerioVoz();

        System.out.println("\n A partir diretamente do reprodutor musical: ");
        musicas.selecionaMusica();
        musicas.toca();
        musicas.pausa();
        
        System.out.println("\n A partir diretamente do iphone: ");
        celular.addPagina();
        celular.attPagina();
        celular.exibePagina();
        System.out.println("");
        celular.ligar();
        celular.atender();
        celular.iniciarCorrerioVoz();
        System.out.println("");
        celular.selecionaMusica();
        celular.toca();
        celular.iniciarCorrerioVoz();
    }
}
