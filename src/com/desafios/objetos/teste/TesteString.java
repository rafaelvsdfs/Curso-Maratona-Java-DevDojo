package com.desafios.objetos.teste;

import java.util.Scanner;

public class TesteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Você digitou: " + numero);
    }
}
