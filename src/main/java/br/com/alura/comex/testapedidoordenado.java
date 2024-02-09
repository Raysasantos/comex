package br.com.alura.comex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class testapedidoordenado {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael");

        Pedido Pedido1 = new Pedido(cliente, 200, 4);
        Pedido Pedido2 = new Pedido(cliente, 350, 1);
        Pedido Pedido3 = new Pedido(cliente, 120, 5);
        Pedido Pedido4 = new Pedido(cliente, 90, 3);
        Pedido Pedido5 = new Pedido(cliente, 45, 15);

        ArrayList<Pedido> Listadepedidos = new ArrayList<>();
        Listadepedidos.add(Pedido1);
        Listadepedidos.add(Pedido2);
        Listadepedidos.add(Pedido3);
        Listadepedidos.add(Pedido4);
        Listadepedidos.add(Pedido5);
        Listadepedidos.sort(Comparator.comparing(Pedido::getValorTotal));

        System.out.println(Listadepedidos);
        Listadepedidos.sort(Comparator.comparing(Pedido::getValorTotal).reversed());
    }
}