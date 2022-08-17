public abstract class Personagem {
    protected String nome;
    protected TipoPersonagem tipoPersonagem;
    protected int inteligencia;
    protected int forca;
    protected int vigor;
    protected int resistencia;
    protected int destreza;

    public Personagem(String nome, TipoPersonagem tipoPersonagem, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipoPersonagem = tipoPersonagem;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public abstract double getDanoAtaque();

    @Override
    public String toString() {
        String danoAtaqueFormatado = String.format("%.2f", getDanoAtaque());

        return "Personagem {" +
                " nome = " + nome +
                ", tipoPersonagem = " + tipoPersonagem +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                ", dano ataque = " + danoAtaqueFormatado +
                " }";
    }
}
