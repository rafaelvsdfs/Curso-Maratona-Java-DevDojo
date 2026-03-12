package academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(24 - 2);
    }

    public void multiplicaDoisNumeros(int num01, int num02) {
        System.out.println(num01 * num02);
    }

    public double divideDoisNumeros(double num01, double num02) {
        if (num02 == 0) {
            return 0;
        }
        return num01 / num02;
    }


    public void imprimeDoisNumeros(double num01, double num02) {
        if (num02 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num01 / num02);
    }

    public void alteraDoisNumeros(int numero01, int numero02) {
        numero01= 99;
        numero02 = 22;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num01: " + numero01);
        System.out.println("Num02: " + numero02);
    }
}
