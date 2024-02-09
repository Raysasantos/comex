package br.com.alura.comex;

public class Testapedido {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael");


        Produto produto = new Produto();
        produto.nome = "Esponja";
        produto.descricao = "espoja para louça";
        produto.precounitario = 1.50;
        produto.quantidade = 20;
        Pedido Pedido = new Pedido(cliente, 100 , 2);

        System.out.println(Pedido.toString());


    }

}
