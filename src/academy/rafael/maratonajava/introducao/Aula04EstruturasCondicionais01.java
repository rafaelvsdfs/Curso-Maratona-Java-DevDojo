package academy.rafael.maratonajava.introducao;

public class Aula04EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // =========================
        // EXEMPLO 1 - IF / ELSE
        // =========================
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println("----------------------");

        // =========================
        // EXEMPLO 2 - USANDO NEGAÇÃO (!)
        // =========================
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
    }
}

