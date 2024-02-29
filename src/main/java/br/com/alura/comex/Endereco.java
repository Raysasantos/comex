package br.com.alura.comex;

public class Endereco {
    String bairro;
    String cidade;
    String complemento;
    String  estado;
    String rua;
    int numero;
    public Endereco(EnderecoRecord record){
        this.bairro = record.bairro();
        this.cidade = record.cidade();
        this.estado = record.estado();
        this.complemento = record.complemento();
        this.numero = record.numero();


    }
    public Endereco(){}

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}

