package academy.rafael.maratonajava.introducao;

public class Aula03Operadores {
    public static void main (String[] args) {
        // + - / *  Aritimeticos
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02);
        System.out.println(numero02 - numero01);
        System.out.println(numero02 / numero01);
        System.out.println(numero01 * numero02);

        int soma = numero01 + numero02;
        System.out.println("O valor da soma de " + numero01 + " e " + numero02 + " é " + soma);

        // %    resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=  relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("Dez é maior que Vinte ? " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que Vinte ? " + isDezMenorQueVinte);
        System.out.println("Dez é igual a Vinte ? " + isDezIgualQueVinte);
        System.out.println("Dez é maior ou igual a Vinte ? " + isDezMaiorOuIgualQueVinte);
        System.out.println("Dez é diferente a Vinte ? " + isDezDiferenteQueVinte);

        // && (AND) || (OR) ! (NO)          lógicos
        int idade = 18;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 600;
        double valorTotalContaPoupanca = 2500;
        double valorDasDuasContas = valorTotalContaPoupanca + valorTotalContaCorrente;
        float valorPlaystation = 3000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation || valorDasDuasContas >= valorPlaystation ;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=    atribuiçao
        double bonus = 1800;
        bonus += 1000;  //2800
        bonus -= 50;    //2750
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;

        System.out.println(contador);
    }
}
