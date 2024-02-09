package br.com.alura.comex;

public class Produto {
    public String nome;
    public String descricao;
    public double precounitario;
    public int quantidade;

    @Override
    public String toString() {
        return " >> Dados do produto \n" +
                ":: Nome: " + nome + "\n" +
                ":: Descricao: " + descricao;

    }
}
