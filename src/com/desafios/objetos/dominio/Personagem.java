package com.desafios.objetos.dominio;

public class Personagem {
    public int vidaAtual = 100;
    public int dano(int dano) {
        vidaAtual = vidaAtual - dano;
        return vidaAtual;
    }
    public int cura(int cura) {
        vidaAtual = vidaAtual + cura;
        if (vidaAtual > 100) {
            vidaAtual = 100;
        }
        return vidaAtual;
    }

    public void resultado() {
        System.out.println(vidaAtual);
    }
}
