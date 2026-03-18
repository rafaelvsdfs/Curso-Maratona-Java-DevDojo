package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora01;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01");
    }
}
