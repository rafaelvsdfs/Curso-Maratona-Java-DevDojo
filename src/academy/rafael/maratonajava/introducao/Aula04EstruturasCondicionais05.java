package academy.rafael.maratonajava.introducao;

import java.util.Arrays;

public class Aula04EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando o 1 como domingo

        byte dia = 5;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ternça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M' :
                System.out.println("Masculino");
                break;
            case 'F' : {
                System.out.println("Feminino");
                break;
            }
            default:
                System.out.println("Sexo invalido");
        }
        // e possivel usar as {} nesse caso mas nao e indicado

    }
}
