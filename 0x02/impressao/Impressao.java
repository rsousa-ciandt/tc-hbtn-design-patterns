public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private double valorPretoBrancoFrenteVerso;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas, double valorPretoBrancoFrenteVerso) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double calcularTotal() {
        int paginasNaoColoridas = getPaginasNaoColoridas();

        double valorImpressaoColorida = ehFrenteVerso ? valorColoridasFrenteVerso : valorColoridasFrenteApenas;
        double valorImpressaoNaoColorida = ehFrenteVerso ? valorPretoBrancoFrenteVerso : valorPretoBrancoFrenteApenas;

        double totalColoridas =  paginasColoridas * valorImpressaoColorida;
        double totalNaoColoridas = paginasNaoColoridas * valorImpressaoNaoColorida;

        return totalColoridas + totalNaoColoridas;
    }

    @Override
    public String toString() {
        String ehFrenteVersoString = ehFrenteVerso ? "frente e verso" : "frente apenas";

        return String.format(
                "total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, getPaginasNaoColoridas(), ehFrenteVersoString, calcularTotal()
        );
    }

    private int getPaginasNaoColoridas() {
        return paginasTotais - paginasColoridas;
    }
}
