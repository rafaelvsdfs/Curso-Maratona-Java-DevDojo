package academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa01 {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("idade invalida !");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

}
