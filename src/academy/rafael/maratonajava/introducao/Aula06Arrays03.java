package academy.rafael.maratonajava.introducao;

public class Aula06Arrays03 {
    public static void main(String[] args) {
        int [] numeros01 = new int[3];
        numeros01[0] = 43;
        numeros01[0] = 2;
        numeros01[0] = 22;
        String [] numeros02 = {"Quarenta e trez","dois","vinte e dois"};
        String [] numeros03 = new String[] {"Quarenta e três","dois","vinte e dois"};

//        for (int i = 0; i < numeros02.length; i++) {
//            System.out.println(numeros02[i]);
//        }

        for (String i:numeros02) {
            System.out.println(i);
        }


    }
}
