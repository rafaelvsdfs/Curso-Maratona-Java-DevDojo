package academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario02 {
    private String nome;
    private int idade;
    private int[] salario;

    public void imprimiDadosFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade:" + this.idade);
        if (salario != null) {
            int contador = 0;
            for (int i : salario) {
                contador += 1;
                System.out.println("salario " + contador + " " + i);
            }
        } else {
            System.out.println("Salario não informado");
        }
        imprimiMediaSalarios();
    }

    public void imprimiMediaSalarios() {
        if (salario == null) {
            return;
        }
        int somaSalarioTotal = 0;
        int somaQuantidade = 0;
        for (int i = 0; i < salario.length; i++) {
            somaSalarioTotal += salario[i];
            somaQuantidade ++;
        }
        System.out.println("A media de salario é " + somaSalarioTotal / somaQuantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }
}
