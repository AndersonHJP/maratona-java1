package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;

        // Operadores logicos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezIgualOuDiferenteQueDez = 10 != 10;
        boolean isDezIgualOuMaiorQueDez = 10 >= 10;
        boolean isDezIgualOuMenorQueDez = 10 >= 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez " + isDezIgualQueDez);
        System.out.println("isDezIgualOuDiferenteQueDez " + isDezIgualOuDiferenteQueDez);
        System.out.println("isDezIgualOuMaiorQueDez " + isDezIgualOuMaiorQueDez);
        System.out.println("isDezIgualOuMenorQueDez " + isDezIgualOuMenorQueDez);

        // && (AND) || (or) !
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade < 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 2;
        bonus /= 2;
        System.out.printf("bonus "+bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println("contador "+contador);
    }
}
