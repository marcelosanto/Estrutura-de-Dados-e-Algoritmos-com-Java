package estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
    public void adiciona(String elemento) {
        for(int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    */

    /*public void adiciona(int posicao, String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possivel adicionar novos elementos.");
        }
    }*/

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }


    public void remove(int posicao) {
    }

    public String busca(int posicao) {
        return null;
    }

    public int busca(String elemento) {
        return 0;
    }

    public int tamanho() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
