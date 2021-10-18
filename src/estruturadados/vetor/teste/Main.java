package estruturadados.vetor.teste;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> vetor = new ArrayList<Contato>();


        Contato c1 = new Contato("Contato 1", "13215-5585", "lols1@lols.com");
        Contato c2 = new Contato("Contato 2", "23215-5585", "lols2@lols.com");
        Contato c3 = new Contato("Contato 3", "33215-5585", "lols3@lols.com");
        Contato c4 = new Contato("Contato 4", "43215-5585", "lols4@lols.com");
        Contato c5 = new Contato("Contato 5", "53215-5585", "lols5@lols.com");

        vetor.add(c1);
        vetor.add(c2);
        vetor.add(c3);
        vetor.add(c4);
        vetor.add(c5);

        System.out.println("Tamanho é : " + vetor.size());
        System.out.println(vetor);


    }
}
