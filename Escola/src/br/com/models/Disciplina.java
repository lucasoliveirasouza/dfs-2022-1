package br.com.models;

import br.com.generics.IAvaliacao;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private ArrayList<IAvaliacao> avaliacoes;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        avaliacoes = new ArrayList<IAvaliacao>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<IAvaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(IAvaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
