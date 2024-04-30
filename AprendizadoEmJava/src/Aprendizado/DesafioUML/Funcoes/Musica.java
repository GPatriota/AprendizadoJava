package Aprendizado.DesafioUML.Funcoes;

import Aprendizado.DesafioUML.Classes.ReprodutorMusical;

public class Musica implements ReprodutorMusical{
    public void toca (){
        System.out.println("Tocando música...");
    }

    public void pausa (){
        System.out.println("Pausando música...");
    }

    public void selecionaMusica (){
        System.out.println("Selecionando música...");
    }
}
