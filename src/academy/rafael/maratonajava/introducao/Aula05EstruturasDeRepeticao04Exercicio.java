package academy.rafael.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

       int valorCarro = 55000;

       for (int parcela = 1 ; parcela <= valorCarro ; parcela++){
           double valorParcela = valorCarro / parcela;
           if (valorParcela >= 1000) {
               System.out.println("Parcela N° " + parcela + " R$ " + valorParcela);
           } else {
               break;
           }
       }
    }
}
