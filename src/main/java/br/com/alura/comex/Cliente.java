package br.com.alura.comex;

public class Cliente {
        private String Nome;
        private String CPF;
        private   String Email;
        private String Profissao;
        private String Telefone;
        private Endereco endereco;

        public Cliente(String nome) {
            Nome = nome;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String nome) {
            Nome = nome;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getProfissao() {
            return Profissao;
        }

        public void setProfissao(String profissao) {
            Profissao = profissao;
        }

        public String getTelefone() {
            return Telefone;
        }

        public void setTelefone(String telefone) {
            Telefone = telefone;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

}
