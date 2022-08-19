public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(int saude, int ataque) {
        super(saude, ataque);
    }

    public NaveEspacialDecorator(NaveEspacial naveEspacialDecorada) {
        super(naveEspacialDecorada.getSaude(), naveEspacialDecorada.getAtaque());

        this.naveEspacial = naveEspacialDecorada;
    }

    @Override
    public int getSaude() {
        return naveEspacial.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspacial.getAtaque();
    }

    @Override
    public void setSaude(int saude) {
        naveEspacial.setSaude(saude);
    }

    @Override
    public void setAtaque(int ataque) {
        naveEspacial.setAtaque(ataque);
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
