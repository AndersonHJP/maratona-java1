package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 1000000
        int count = 0;
        while (count <= 1000) {
            System.out.println(count);
            count += 2;
        }
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("For " + i);
            }
        }
    }
}
