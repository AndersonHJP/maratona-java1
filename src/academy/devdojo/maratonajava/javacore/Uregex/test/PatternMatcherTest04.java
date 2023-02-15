package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que não for incluso no \W
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0X 0X 0XFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
