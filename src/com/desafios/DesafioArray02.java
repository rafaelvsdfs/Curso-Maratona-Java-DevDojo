package com.desafios;

public class DesafioArray02 {
    public static void main(String[] args) {

        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int somaMatriz = 0;
        int somaMatrizDiagonalPrincipal = 0;
        int somaMatrizDiagonalSegundaria = 0;

        for (int i = 0; i < matriz.length; i++) {

            // Diagonal principal
            somaMatrizDiagonalPrincipal += matriz[i][i];

            // Diagonal secundária
            somaMatrizDiagonalSegundaria += matriz[i][matriz.length - 1 - i];

            // Soma total da matriz
            for (int k = 0; k < matriz[i].length; k++) {
                somaMatriz += matriz[i][k];
            }
        }

        System.out.println("A soma da diagonal principal: " + somaMatrizDiagonalPrincipal);
        System.out.println("A soma da diagonal secundária: " + somaMatrizDiagonalSegundaria);
        System.out.println("A soma de todos os valores: " + somaMatriz);

        for (int[] arrayBase : matriz) {
            System.out.println();
            for (int arrayValor : arrayBase) {
                System.out.print(arrayValor + " ");
            }
        }
    }
}