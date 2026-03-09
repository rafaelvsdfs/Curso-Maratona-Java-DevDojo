package academy.rafael.maratonajava.introducao;

import java.util.Arrays;

public class Aula04EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Ultilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo

        byte dia = 7;
        switch (dia){
            case 1 :
                System.out.println("Domingo, final de semana");
                break;
            case 2 :
                System.out.println("Segunda, dia útil");
                break;
            case 3 :
                System.out.println("Terça, dia útil");
                break;
            case 4 :
                System.out.println("Quarta, dia útil");
                break;
            case 5  :
                System.out.println("Quinta, dia útil");
                break;
            case 6 :
                System.out.println("Sexta, dia útil");
                break;
            case 7 :
                System.out.println("Sabádo, finaal de semana");
                break;
            default:
                System.out.println("Dia invalido");
        }

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;

        }

    }
}
