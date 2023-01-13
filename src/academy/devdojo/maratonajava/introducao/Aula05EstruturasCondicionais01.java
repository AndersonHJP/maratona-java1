package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não está autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não está autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c == false){
            System.out.println("Dentro de algo que nunca de ser feito");
        }

        System.out.println("Fora do if");
    }
}
