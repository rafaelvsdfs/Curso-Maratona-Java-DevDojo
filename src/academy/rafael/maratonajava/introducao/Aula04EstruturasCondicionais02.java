package academy.rafael.maratonajava.introducao;

public class Aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria = "";
        if (idade < 15){
            categoria = "Você pertence a categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Você pertence a categoria juvenil";
        } else {
            categoria = "Você pertence a categoria adulta ";
        }

        System.out.println(categoria);
    }
}
