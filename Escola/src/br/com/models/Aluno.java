package br.com.models;

import br.com.generics.PessoaAbstrata;


public class Aluno extends PessoaAbstrata {
    private String matricula;

    public Aluno(String nome, String telefone, String sexo, String cpf,  String matricula) {
        super(nome, telefone, sexo, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados() {
        return "Nome: " + getNome() + "\n" +
                "Telefone:" + getTelefone() + "\n"+
                "Sexo:" + getSexo() + "\n"+
                "CPF:" + getCpf() + "\n"+
                "Matrícula: " + getMatricula() + "\n\n";
    }
}
