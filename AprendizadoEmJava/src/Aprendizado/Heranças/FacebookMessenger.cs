using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AprendizadoEmJava.src.Aprendizado.Heranças
{
    public class FacebookMessenger extends ServicoMensagemInstantanea {
        public void enviarMensagem() {
            System.out.println("Enviando mensagem pelo Facebook Messenger");
        }
        public void receberMensagem() {
            System.out.println("Recebendo mensagem pelo Facebook Messenger");
        }
    }
}