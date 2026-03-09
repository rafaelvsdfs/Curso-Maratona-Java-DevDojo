package academy.rafael.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.rafael.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Mestre kami";
        professor.idadeProfessor = 140;
        professor.sexoProfessor = 'M';

        System.out.println(professor.nomeProfessor + " " + professor.idadeProfessor + " " + professor.sexoProfessor);
    }
}
