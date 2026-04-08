package academy.rafael.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int ano;
    private int episodios;
    private int faxetoria;
    private String studio;

    public Anime(String nome, String tipo, int ano, int episodios, int faxetoria) {
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
        this.episodios = episodios;
        this.faxetoria = faxetoria;
    }

    public Anime(String nome, String tipo, int ano, int episodios, int faxetoria, String studio) {
        this(nome, tipo, ano, episodios, faxetoria);
        this.studio = studio;
    }

    public void init(String nome, String tipo, int ano, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int ano, int episodios, int faxetoria) {
        this.init(nome, tipo, ano, episodios);
        this.faxetoria = faxetoria;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano: " + this.ano);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Faixa de idade: " + this.faxetoria + " anos");
        System.out.println("Faixa de idade: " + this.studio + " anos");
    }

}
