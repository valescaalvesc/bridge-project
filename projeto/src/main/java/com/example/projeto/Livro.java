package com.example.projeto;

public abstract class Livro {

    protected Genero genero;

    protected float valor;

    public Livro(float valor) {this.valor = valor;}

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularValor();
}
