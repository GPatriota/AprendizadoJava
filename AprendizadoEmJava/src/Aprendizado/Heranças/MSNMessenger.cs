using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AprendizadoEmJava.src.Aprendizado.Heranças
{
    public class MSNMessenger extends ServicoMensagemInstantanea{
        public void enviarMensagem() {
            System.out.println("Enviando mensagem pelo MSN Messenger");
        }
        public void receberMensagem() {
            System.out.println("Recebendo mensagem pelo MSN Messenger");
        }
    }
}