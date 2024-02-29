package br.com.alura.comex;

import integracao.ViacepResponse;
import integracao.Viacepservice;

public class testeintegraçãoviacep {
    public static void main(String[] args) {
        Viacepservice service = new Viacepservice();
        EnderecoRecord response = service.buscarCEP("02322120");
        Endereco endereco = new Endereco(response);
        System.out.println(endereco);
    }
}
