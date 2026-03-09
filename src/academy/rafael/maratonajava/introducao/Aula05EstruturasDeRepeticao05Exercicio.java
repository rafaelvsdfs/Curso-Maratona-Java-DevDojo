package academy.rafael.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao05Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorCarro = 30000;
        for (int parcela = (int) valorCarro ; parcela >= 1 ; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela N° " + parcela + " R$ " + valorParcela);
        }
    }
}
