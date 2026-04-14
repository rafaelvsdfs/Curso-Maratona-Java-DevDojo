package academy.rafael.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.rafael.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Pice");
        for (int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }
    }
}
