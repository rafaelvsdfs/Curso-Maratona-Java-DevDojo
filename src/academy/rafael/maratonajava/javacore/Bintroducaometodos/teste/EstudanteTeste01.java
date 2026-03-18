package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Estudante01;
import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante01;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante01 estudante01 = new Estudante01();
        Estudante01 estudante02 = new Estudante01();
        ImpressoraEstudante01 impressora = new ImpressoraEstudante01();

        estudante01.nome = "Mestre din";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Hinata";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
