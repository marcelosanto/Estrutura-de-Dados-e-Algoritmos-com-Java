package exercicios;

import estruturadados.vetor.Lista;
import estruturadados.vetor.teste.Contato;

public class Exercicio01 {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>(10);


        Contato c1 = new Contato("Contato 1", "13215-5585", "lols1@lols.com");
        Contato c2 = new Contato("Contato 2", "23215-5585", "lols2@lols.com");
        Contato c3 = new Contato("Contato 3", "33215-5585", "lols3@lols.com");
        Contato c4 = new Contato("Contato 4", "43215-5585", "lols4@lols.com");
        Contato c5 = new Contato("Contato 5", "53215-5585", "lols5@lols.com");

        lista.adiciona(c1);
        lista.adiciona(c2);
        lista.adiciona(c3);
        lista.adiciona(c5);

        System.out.println("Tamanho é : " + lista.tamanho());
        System.out.println(lista);

        Contato c8 = c1;

        boolean contem = lista.contem(c8);
        System.out.println(contem ? "O contato existe" : "O contato não existe");
    }
}
