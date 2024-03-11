package br.com.alura.comex;

public class testClient {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        ClienteDao dao = new ClienteDao(connectionFactory.con());
        Cliente cliente = new Cliente("Manu");
        dao.cadastroDeCliente(cliente);


    }
}
