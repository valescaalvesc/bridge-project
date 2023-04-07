package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HqTest {

    @Test
    void deveRetornarValorHqDeAcao() {
        Genero genero = new Acao();
        Hq hq = new Hq(50.0f);
        hq.setGenero(genero);
        hq.setAnoLancamento(2);
        assertEquals(100.0f, hq.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorHqDeDrama() {
        Genero genero = new Drama();
        Hq hq = new Hq(50.0f);
        hq.setGenero(genero);
        hq.setAnoLancamento(2);
        assertEquals(110.0f, hq.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorHqDeComedia() {
        Genero genero = new Comedia();
        Hq hq = new Hq(50.0f);
        hq.setGenero(genero);
        hq.setAnoLancamento(2);
        assertEquals(120.0f, hq.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorHqDeRomance() {
        Genero genero = new Romance();
        Hq hq = new Hq(50.0f);
        hq.setGenero(genero);
        hq.setAnoLancamento(2);
        assertEquals(130.0f, hq.calcularValor(), 0.01f);
    }
}
