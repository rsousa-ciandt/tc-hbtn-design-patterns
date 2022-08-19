public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int paginasColoridas, boolean ehFrenteVerso) {

        double valorColoridasFrenteVerso;
        double valorColoridasFrenteApenas;
        double valorPretoBrancoFrenteVerso;
        double valorPretoBrancoFrenteApenas;

        switch (tamanhoImpressao) {
            case A2:
                valorColoridasFrenteVerso = 0.28;
                valorPretoBrancoFrenteVerso = 0.18;
                valorColoridasFrenteApenas = 0.320;;
                valorPretoBrancoFrenteApenas = 0.22;

                break;
            case A3:
                valorColoridasFrenteVerso = 0.25;
                valorPretoBrancoFrenteVerso = 0.15;
                valorColoridasFrenteApenas = 0.300;;
                valorPretoBrancoFrenteApenas = 0.20;

                break;
            case A4:
                valorColoridasFrenteVerso = 0.20;
                valorPretoBrancoFrenteVerso = 0.10;
                valorColoridasFrenteApenas = 0.250;;
                valorPretoBrancoFrenteApenas = 0.15;

                break;
            default:
                throw new UnsupportedOperationException();
        }

        return new Impressao(totalPaginas, paginasColoridas, ehFrenteVerso, valorColoridasFrenteVerso, valorColoridasFrenteApenas, valorPretoBrancoFrenteApenas, valorPretoBrancoFrenteVerso);
    }
}
