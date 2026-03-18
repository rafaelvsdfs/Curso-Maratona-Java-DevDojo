package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora02;

public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora02 calculadora = new Calculadora02();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(numeros);
        calculadora.somaVarargs(1,2,3,4,5,6,7,8,9);
    }
}
