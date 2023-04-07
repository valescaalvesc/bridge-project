package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MangaTest {

    @Test
    void deveRetornarValorMangaDeAcao() {
        Genero genero = new Acao();
        Manga manga = new Manga(1000.0f);
        manga.setGenero(genero);
        assertEquals(1000.0f, manga.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMangaDeDrama() {
        Genero genero = new Drama();
        Manga manga = new Manga(1000.0f);
        manga.setGenero(genero);
        assertEquals(1000.0f, manga.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMangaDeComedia() {
        Genero genero = new Comedia();
        Manga manga = new Manga(1000.0f);
        manga.setGenero(genero);
        assertEquals(1000.0f, manga.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMangaComRomance() {
        Genero genero = new Romance();
        Manga manga = new Manga(1000.0f);
        manga.setGenero(genero);
        assertEquals(1000.0f, manga.calcularValor(), 0.01f);
    }
}
