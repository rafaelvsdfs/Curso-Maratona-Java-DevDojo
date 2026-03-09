package academy.rafael.maratonajava.introducao;

public class Aula04EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario >= 5000
        double salario = 6000;
        String mensagemDoar =  "Eu vou doar 500 por Neymar";
        String mensagemNaoDoar = "Ainda não tenha consições, mas vou ter !";
        // (condicao) ? verdadeiro : falso;
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
