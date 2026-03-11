package com.desafios.objetos.teste;

import com.desafios.objetos.dominio.Personagem;

public class PersonagemTeste01 {
    public static void main(String[] args) {
        Personagem jogador01 = new Personagem();
        int result = jogador01.dano(40);
        int result2 = jogador01.cura(30);
        System.out.println(jogador01.vidaAtual);
    }
}
