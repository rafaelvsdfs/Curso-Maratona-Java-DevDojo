package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudantes;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

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
