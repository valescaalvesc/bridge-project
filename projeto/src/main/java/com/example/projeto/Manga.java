package com.example.projeto;

public class Manga extends Livro{

    public Manga(float valor) {
        super(valor);
    }

    public float calcularValor() {
        return this.valor;
    }
}
