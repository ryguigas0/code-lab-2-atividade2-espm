import java.util.*;

// import static javax.swing.JOptionPane.*;

import models.*;

public class Sistema {
    Caixa[] caixas = new Caixa[3];

    Queue<Transacao> filaTransacoes = new LinkedList<Transacao>();

    int cronometro = 0; // segundos

    public void inicializar() {
        // TODO: Implementar inicialização
        throw new RuntimeException("inicializar not implemented");
    }
}
