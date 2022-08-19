public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveEspacialDecorada;

    public NaveEspacialDecorator(int saude, int ataque) {
        super(saude, ataque);
    }

    public NaveEspacialDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada.getSaude(), naveEspacialDecorada.getAtaque());

        this.naveEspacialDecorada = naveEspacialDecorada;
    }

    @Override
    public int getSaude() {
        return naveEspacialDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspacialDecorada.getAtaque();
    }

    @Override
    public void setSaude(int saude) {
        naveEspacialDecorada.setSaude(saude);
    }

    @Override
    public void setAtaque(int ataque) {
        naveEspacialDecorada.setAtaque(ataque);
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
