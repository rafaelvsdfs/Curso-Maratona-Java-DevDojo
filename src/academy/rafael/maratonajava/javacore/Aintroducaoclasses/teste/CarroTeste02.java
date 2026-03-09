package academy.rafael.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.rafael.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste02 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Nissan";
        carro01.modelo = "GT-R";
        carro01.ano = 2020;

        carro02 = carro01;

        System.out.println("Carro 01 : " + carro01.nome + " " + carro01.modelo + "  " + carro01.ano);
        System.out.println("------------------------");
        System.out.println("Carro 02 : " + carro02.nome + " " + carro02.modelo + "  " + carro02.ano);

    }
}
