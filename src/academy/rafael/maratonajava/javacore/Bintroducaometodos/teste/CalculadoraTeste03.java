package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora01;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();
        int result = (int) calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println("-------------------------");
        System.out.println(calculadora.divideDoisNumeros(20, 2));
        System.out.println("-------------------------");
        calculadora.imprimeDoisNumeros(10,2);
    }
}
