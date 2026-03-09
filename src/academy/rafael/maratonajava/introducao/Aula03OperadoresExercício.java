package academy.rafael.maratonajava.introducao;

public class Aula03OperadoresExercício {


    public static void main (String[] args) {
        //Exercicio 01

        double salario = 2500;
        salario += 500;
        salario -= 300;
        salario *= 1.10;     // 10%
        salario /= 2;
        //double dezPorcento = salario / 10;
        //double salarioBruto = salario + dezPorcento ;

        System.out.println(salario);

        //Exercicio 02

        int pontos = 100;
        pontos += 20;
        pontos -= 5;
        pontos *= 3;
        pontos %= 7;
        pontos ++;
        pontos --;

        System.out.println(pontos);

    }
}
