package com.desafios;

public class DesafioArray01 {
    public static void main(String[] args) {

        double[] notasTurma = {9, 4, 7, 8, 9, 4, 7.8, 9};

        double somaNotas = 0;
        double maior = notasTurma[0];
        double menor = notasTurma[0];
        double mediaNotasDefinida = 7;
        int contadorMenor = 0;
        int contadorMaior = 0;

        for (int i = 0; i < notasTurma.length; i++) {

            somaNotas += notasTurma[i];

            if (notasTurma[i] < mediaNotasDefinida) {
                contadorMenor += 1;
            }

            if (notasTurma[i] >= mediaNotasDefinida) {
                contadorMaior += 1;
            }

            if (notasTurma[i] > maior) {
                maior = notasTurma[i];
            }

            if (notasTurma[i] < menor) {
                menor = notasTurma[i];
            }
        }

        double mediaNotas = somaNotas / notasTurma.length;

        System.out.println("Média: " + mediaNotas);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        System.out.println(contadorMenor + " ficaram abaixo da media");
        System.out.println(contadorMaior + " ficaram acima da media");
    }
}