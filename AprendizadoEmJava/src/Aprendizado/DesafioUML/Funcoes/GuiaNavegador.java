package Aprendizado.DesafioUML.Funcoes;

import Aprendizado.DesafioUML.Classes.*;

public class GuiaNavegador implements Navegador{
    public void addPagina (){
        System.out.println("Adicionando página...");
    }

    public void attPagina (){
        System.out.println("Atualizando página...");
    }

    public void exibePagina (){
        System.out.println("Exibindo página...");
    }
}
