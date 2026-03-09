package academy.rafael.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.rafael.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nomeEstudante = "Sanji";
        System.out.println(estudante.idadeEstudante);
        System.out.println(estudante.nomeEstudante);
        System.out.println(estudante.sexoEstudante);
        System.out.println("--------------------");
        System.out.println(estudante2.idadeEstudante);
        System.out.println(estudante2.nomeEstudante);
        System.out.println(estudante2.sexoEstudante);

    }
}
