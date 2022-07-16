package br.com.models;

import br.com.generics.PessoaAbstrata;

import java.util.Date;

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
}
