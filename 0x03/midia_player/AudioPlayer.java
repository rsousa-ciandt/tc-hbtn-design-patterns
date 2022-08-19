public class AudioPlayer implements MediaPlayer {
    private MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia == TipoMedia.MP3) {
            System.out.printf("Reproduzindo MP3: %s", nomeArquivo);
        }

        mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
        mediaPlayerAdapter.reproduzir(tipoMedia, nomeArquivo);
    }
}
