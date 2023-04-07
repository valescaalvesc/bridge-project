package com.example.projeto;

public class Hq extends Livro{

    private int anoLancamento;

    public Hq(float valor) {
        super(valor);
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public float calcularValor() {
        return this.valor * this.anoLancamento * (1 + this.genero.percentualGenero());
    }
}
