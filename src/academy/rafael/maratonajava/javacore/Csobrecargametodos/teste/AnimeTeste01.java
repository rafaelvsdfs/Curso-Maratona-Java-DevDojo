package academy.rafael.maratonajava.javacore.Csobrecargametodos.teste;

import academy.rafael.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Pice", "Shonen", 1500, 1999, 12);
        anime.imprime();
    }
}
