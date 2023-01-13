package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 2;
        // char, int, byte, short, enum, String
        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'H':
                System.out.println("Homem");
                break;
            case 'M': {
                System.out.println("Mulher");
                break;
            }
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
