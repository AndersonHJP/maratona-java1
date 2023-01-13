package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (long) 100000;
        double salarioDobule = 200.0D;
        double salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos! ");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
    }
}
