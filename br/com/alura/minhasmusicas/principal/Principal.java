package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Galileu");
        musica.setArtista("Fernandinho");

        for (int i = 0; i < 5000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 250; i++) {
            musica.curte();
        }

        Podcasts podcast = new Podcasts();
        podcast.setTitulo("Flow");
        podcast.setApresentador("Igor");

        for (int i = 0; i < 3000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 300; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
