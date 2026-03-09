package academy.rafael.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.rafael.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idadeEstudante = 21;
        estudante.nomeEstudante = "Gohan";
        estudante.sexoEstudante = 'M';
        System.out.println(estudante.idadeEstudante);
        System.out.println(estudante.nomeEstudante);
        System.out.println(estudante.sexoEstudante);
        System.out.println(estudante);

    }
}
