package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {  // contando de 1 até 10
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        for (int i=0; i < 10; i++) { //procurando o numero de 0 a 10
            System.out.println("For "+i);
        }
    }
}
