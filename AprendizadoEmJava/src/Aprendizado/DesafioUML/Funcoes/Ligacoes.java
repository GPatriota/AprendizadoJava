package Aprendizado.DesafioUML.Funcoes;

import Aprendizado.DesafioUML.Classes.AparelhoTelefonico;

public class Ligacoes implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando...");
    }

    public void atender (){
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorrerioVoz (){
        System.out.println("Iniciando correio de voz...");
    }
}
