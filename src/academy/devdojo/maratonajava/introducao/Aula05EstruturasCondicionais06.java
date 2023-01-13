package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        //  entao 7 e 1
        byte dia = 5;
        switch (dia) {
            case 7:
                System.out.println("Sabado- Final de semana");
                break;
            case 1:
                System.out.println("Domingo - final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
