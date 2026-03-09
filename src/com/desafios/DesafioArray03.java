package com.desafios;

public class DesafioArray03 {
    public static void main(String[] args) {
        int[][] calendario = new int[5][7];
        int iniciosemana = 2; //quarta-feira (domingo = 0)
        int dia = 1;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if ((i == 0 && j > iniciosemana) || (i > 0)) {
                    if (dia <= 30) {
                        calendario[i][j] = dia;
                        dia ++;
                    }
                }
            }
        }
        // Impressão formatada
        System.out.println(" Dom Seg Ter Qua Qui Sex Sab");

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {

                if (calendario[i][j] == 0) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%3d ", calendario[i][j]);
                }
            }
            System.out.println();
        }
    }
}