package academy.rafael.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int contador = 0;
        while (contador <= 22){
            System.out.println("Dentro do while " + contador);
            contador ++;
        }

        contador = 0;
        do {
            System.out.println("Dentro do do-while " + ++ contador);
        } while (contador < 22);

        for (int i = 0 ; i <= 22 ; i++) {
            System.out.println("Dentro do for " + i);
        }


    }
}
