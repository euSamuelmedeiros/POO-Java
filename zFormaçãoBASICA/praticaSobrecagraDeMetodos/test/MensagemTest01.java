package zFormaçãoBASICA.praticaSobrecagraDeMetodos.test;

import zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain.Mensagem;

public class MensagemTest01 {
    public static void main(String[] args) {
        Mensagem men = new Mensagem();

        men.eviar("Ola MUndo");
        men.enviarDestinatario("Felipe Beraldo", "Ola");
        men.RepetirVezes("Repetindo...", 4);
        men.Remetente("Samuel ", "Maria luiza", "Ola");
        men.enviar(new String[]{"Maria luiza", "I love you"});
        men.estudandoJava("Estudando java", 4);
    }
}
