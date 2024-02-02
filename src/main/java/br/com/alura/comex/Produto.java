package br.com.alura.comex;

public class Produto {
    String nome;
    String descricao;
    double precounitario;
    int quantidade;

    @Override
    public String toString() {
        return " >> Dados do produto \n" +
                ":: Nome: " + nome + "\n" +
                ":: Descricao: " + descricao;

    }
}
