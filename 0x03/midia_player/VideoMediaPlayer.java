public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String nomeArquivo) {
        System.out.printf("Reproduzindo VLC: %s", nomeArquivo);
    }

    @Override
    public void reproduzirMp4(String nomeArquivo) {
        System.out.printf("Reproduzindo MP4: %s", nomeArquivo);
    }
}
