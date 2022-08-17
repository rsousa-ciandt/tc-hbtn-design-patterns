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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoPersonagem(TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public String toString() {
        String danoAtaqueFormatado = String.format("%.2f", getDanoAtaque());

        return "Personagem {" +
                " nome = " + nome +
                ", tipo = " + tipoPersonagem +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                ", dano ataque = " + danoAtaqueFormatado +
                " }";
    }
}
