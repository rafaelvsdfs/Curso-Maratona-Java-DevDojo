package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario01;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario01 funcionario01 = new Funcionario01();
        funcionario01.nome = "Bolsonaro";
        funcionario01.idade = 57;
        funcionario01.salario = new int[]{1500, 2000, 2500};

        funcionario01.imprimiDadosFuncionario();

    }
}
