package br.com.alura.comex;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Pedido {
    private int ID;
    private Cliente cliente;
    private double preco;
    private int quantidade;
    public Pedido() {
    }

    public Pedido(Cliente cliente, double preco, int quantidade) {
        this.preco = preco;
        this.cliente = cliente;
        this.quantidade = quantidade;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "ID=" + ID +
                ", cliente=" + cliente +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", valor total =" + getValorTotal() +
                '}';



        }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        if (preco< outroPedido.preco){
            return true;
        } else {
            return false;
        }


    }
    public boolean isMaisCaroQue(Pedido outroPedido) {
        if (preco> outroPedido.preco){
            return true;
        } else {
            return false;

        }

    }
    public BigDecimal getValorTotal() {
        BigDecimal precobig = BigDecimal.valueOf(this.preco);
        BigDecimal quantidadebig = BigDecimal.valueOf(this.quantidade);
        return precobig.multiply(quantidadebig);

    }
}