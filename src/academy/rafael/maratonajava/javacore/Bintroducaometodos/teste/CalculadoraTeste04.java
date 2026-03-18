package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora01;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro do CalculadoraTeste04 ");
        System.out.println("Num01: " + a);
        System.out.println("Num02: " + b);
    }
}
