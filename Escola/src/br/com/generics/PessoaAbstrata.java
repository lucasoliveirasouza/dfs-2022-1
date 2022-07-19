package br.com.generics;

import br.com.models.Endereco;

public abstract class PessoaAbstrata {
    private String nome;
    private String telefone;
    private String sexo;
    private String cpf;
    private Endereco endereco;

    public PessoaAbstrata(String nome, String telefone, String sexo, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public  abstract  String obterDados();

}
