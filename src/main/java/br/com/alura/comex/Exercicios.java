package br.com.alura.comex;

public class Exercicios {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Box Potter";
        produto.descricao = "Bruxo que perdeu os pais, viveu com os tios e foi estudar magia";
        produto.precounitario = 359.90;
        produto.quantidade = 7;

        Produto produto2 = new Produto();
        produto2.nome = "Bicicleta";
        produto2.descricao = "A bicicleta é um aparelho para prática de exercícios físicos e um meio de transporte barato e sustentável.";
        produto2.precounitario = 5.000;
        produto2.quantidade = 2;

        if (produto.equals(produto2)) {
            System.out.println("As referências são iguais.");
        } else {
            System.out.println("As referências são diferentes.");
        }

        System.out.println(produto.toString());
        System.out.println(produto2.toString());


        // Exercicio 6 a 7

        Endereco endereco = new Endereco();
        endereco.bairro = "Vila zilda";
        endereco.cidade = "Sao paulo";
        endereco.complemento = "casa 1";
        endereco.estado = " sao paulo";
        endereco.rua = "Rua antonello da messina";
        endereco.numero = 45;

        Cliente cliente = new Cliente("Raysa");

        cliente.setCPF("476055466-90");
        cliente.setEmail("mouraraysa081@gmail.com");
        cliente.setProfissao("Medica");
        cliente.setTelefone("95154-8754");

    }
}
