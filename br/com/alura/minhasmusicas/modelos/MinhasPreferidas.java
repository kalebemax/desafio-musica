package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é o hit do momento!");
        } else {
            System.out.println(audio.getTitulo() + " vale a pena salvar para escutar depois");
        }
    }
}
