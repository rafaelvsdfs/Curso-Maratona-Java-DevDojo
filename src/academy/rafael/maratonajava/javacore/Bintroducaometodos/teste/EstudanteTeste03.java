package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Estudante02;

public class EstudanteTeste03 {
    public static void main(String[] args) {
        Estudante02 estudante01 = new Estudante02();
        Estudante02 estudante02 = new Estudante02();

        estudante01.nome = "Mestre din";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Hinata";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
