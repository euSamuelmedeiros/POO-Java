package zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain;

public class Mensagem {
    public void eviar(String txt) {
        System.out.println("Mensagem: " + txt);
    }

    public void enviarDestinatario(String destinatario, String txt) {
        System.out.println("Mensagem para " + destinatario + ": " + txt);
    }

    public void RepetirVezes(String txt, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("[" + (i + 1) + "]" + txt);

        }

    }

    public void Remetente(String remetente, String destinatario, String txt) {
        System.out.println(remetente + "enviou para " + destinatario + ": " + txt);
    }

    public void enviar(String[] mensagem) {
        for (String msg : mensagem) {
            System.out.println("Mensagem: " + msg);
        }

    }

    public void estudandoJava(String txt, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println(txt);

        }
    }
}



