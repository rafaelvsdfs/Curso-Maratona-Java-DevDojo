package academy.rafael.maratonajava.introducao;

public class Aula07ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{2, 3};
        arrayInt[1] = new int[]{87, 4, 12};
        arrayInt[2] = new int[]{23, 31, 82, 90};

        int[][] arrayInt2 = new int[][]{{2, 4}, {7, 5, 9}, {12, 5, 89, 8}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------------");
            for (int arrayValor : arrayBase) {
                System.out.print(arrayValor + "  ");
            }
        }
    }
}
