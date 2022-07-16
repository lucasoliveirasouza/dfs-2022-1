package br.com.models;

import br.com.generics.IAvaliacao;

public class Prova implements IAvaliacao {

    @Override
    public double obterNota(double nota) {
        return nota * 0.3;
    }
}
