package academy.rafael.maratonajava.javacore.Bintroducaometodos.teste;

import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario01;
import academy.rafael.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTeste02 {
    public static void main(String[] args) {
        Funcionario02 funcionario = new Funcionario02();

        funcionario.setNome("Rafael");
        funcionario.setIdade(17);
        funcionario.setSalario(new int[]{1500,2000,2500});
        funcionario.imprimiDadosFuncionario(); 
    }
}
