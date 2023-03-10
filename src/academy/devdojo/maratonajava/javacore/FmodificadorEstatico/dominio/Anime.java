package academy.devdojo.maratonajava.javacore.FmodificadorEstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentrodo bloco de inicializacao estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentrodo bloco de inicializacao estático 2");
    }
    static {
        System.out.println("Dentrodo bloco de inicializacao estático 3");
    }
    {
        System.out.println("Dentrodo bloco de inicializacao não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: Anime.episodios) {
            System.out.print(episodio +" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
