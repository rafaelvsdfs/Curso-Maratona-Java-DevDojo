package academy.rafael.maratonajava.javacore.Dconstrutores.teste;

import academy.rafael.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Shonen", 1500, 1999, 12, "Produção IG");
        anime.imprime();
    }
}
