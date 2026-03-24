package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa01;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa01 pessoa = new Pessoa01();


        // pessoa.nome = "Rafael";  metodo sem private
        pessoa.setNome("Rafael");
        pessoa.setIdade(100);;
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
