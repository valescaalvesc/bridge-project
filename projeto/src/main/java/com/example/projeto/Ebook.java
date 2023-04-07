package com.example.projeto;

public class Ebook extends Livro{

    public Ebook(float valor) {
        super(valor);
    }

    public float calcularValor() {
        return this.valor * (1 + this.genero.percentualGenero());
    }
}
