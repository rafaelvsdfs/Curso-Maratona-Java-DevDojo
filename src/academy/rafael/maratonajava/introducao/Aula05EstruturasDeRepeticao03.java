package academy.rafael.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os 25 primeiros numeros ímpares de 1 a 100

        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 && contador < 25 ){
                System.out.println(i);
                contador++;

                if (contador == 25){
                    break;
                }
            }
        }
    }
}
