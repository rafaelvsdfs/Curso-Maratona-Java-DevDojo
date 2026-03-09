package academy.rafael.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

EU <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula02TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Rafael";
        String endereco = "NewYork";
        double salario = 26000.22;
        String data = "20/10/2028";
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salário de " + salario + ", na data " + data);
    }
}


