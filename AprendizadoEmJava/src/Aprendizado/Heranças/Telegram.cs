package Aprendizado.Heranças;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AprendizadoEmJava.src.Aprendizado.Heranças
{
    public class Telegram extends ServicoPai {
        public void enviarMensagem() {
            System.out.println("Enviando mensagem pelo Telegram");
        }
        public void receberMensagem() {
            System.out.println("Recebendo mensagem pelo Telegram");
        }
    }
}