package br.com.models;

import br.com.generics.PessoaAbstrata;


public class Professor extends PessoaAbstrata {
    private double salario;

    public Professor(String nome, String telefone, String sexo, String cpf, double salario) {
        super(nome, telefone, sexo, cpf);
        this.salario = salario;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String obterDados() {
        return "Nome: " + getNome() + "\n" +
                "Telefone:" + getTelefone() + "\n"+
                "Sexo:" + getSexo() + "\n"+
                "CPF:" + getCpf() + "\n"+
                "Matrícula: " + getSalario() + "\n\n";
    }

}
