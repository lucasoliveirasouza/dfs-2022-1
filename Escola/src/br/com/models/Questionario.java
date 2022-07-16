package br.com.models;

import br.com.generics.IAvaliacao;

public class Questionario implements IAvaliacao {

    @Override
    public double obterNota(double nota) {
        return nota * 0.1;
    }
}
