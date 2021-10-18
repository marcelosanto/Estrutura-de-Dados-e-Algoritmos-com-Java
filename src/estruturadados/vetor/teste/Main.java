package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
