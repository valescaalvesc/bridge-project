package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EbookTest {

    @Test
    void deveRetornarValorEbookDeAcao() {
        Genero genero = new Acao();
        Ebook ebook = new Ebook(2000.0f);
        ebook.setGenero(genero);
        assertEquals(2000.0f, ebook.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorEbookDeDrama() {
        Genero genero = new Drama();
        Ebook ebook = new Ebook(2000.0f);
        ebook.setGenero(genero);
        assertEquals(2200.0f, ebook.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorEbookDeComedia() {
        Genero genero = new Comedia();
        Ebook ebook = new Ebook(2000.0f);
        ebook.setGenero(genero);
        assertEquals(2400.0f, ebook.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorEbookDeRomance() {
        Genero genero = new Romance();
        Ebook ebook = new Ebook(2000.0f);
        ebook.setGenero(genero);
        assertEquals(2600.0f, ebook.calcularValor(), 0.01f);
    }
}
