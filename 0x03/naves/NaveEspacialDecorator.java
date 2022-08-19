public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(int saude, int ataque) {
        super(saude, ataque);
    }

    public NaveEspacialDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada.getSaude(), naveEspacialDecorada.getAtaque());

        this.naveDecorada = naveEspacialDecorada;
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

    @Override
    public void setSaude(int saude) {
        naveDecorada.setSaude(saude);
    }

    @Override
    public void setAtaque(int ataque) {
        naveDecorada.setAtaque(ataque);
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
