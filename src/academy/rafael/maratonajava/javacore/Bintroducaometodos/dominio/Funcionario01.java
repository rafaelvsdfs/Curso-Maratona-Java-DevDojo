package academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario01 {
    public String nome;
    public int idade;
    public int[] salario;

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
            somaQuantidade += i;
        }
        System.out.println("A media de salario é " + somaSalarioTotal / somaQuantidade);
    }
}
