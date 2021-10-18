package estruturadados.vetor.teste;

import estruturadados.vetor.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<Contato>(5);

        Contato c1 = new Contato("Contato 1", "13215-5585", "lols1@lols.com");
        Contato c2 = new Contato("Contato 2", "23215-5585", "lols2@lols.com");
        Contato c3 = new Contato("Contato 3", "33215-5585", "lols3@lols.com");
        Contato c4 = new Contato("Contato 4", "43215-5585", "lols4@lols.com");
        Contato c5 = new Contato("Contato 5", "53215-5585", "lols5@lols.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        vetor.adiciona(c4);
        vetor.adiciona(c5);

        System.out.println("Tamanho é : " + vetor.tamanho());
        System.out.println(vetor);


    }
}
