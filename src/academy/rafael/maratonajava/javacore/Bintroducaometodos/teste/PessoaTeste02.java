package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa02;

public class PessoaTeste02 {
    public static void main(String[] args) {
        Pessoa02 pessoa = new Pessoa02();


        // pessoa.nome = "Rafael";  metodo sem private
        pessoa.setNome("Rafael");
        pessoa.setIdade(100);;
        pessoa.imprime();

    }
}
